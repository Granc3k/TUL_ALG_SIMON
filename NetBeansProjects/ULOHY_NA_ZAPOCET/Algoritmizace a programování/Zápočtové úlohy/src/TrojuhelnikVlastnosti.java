//Designed by Tomas Moravec 
import java.util.Scanner;
public class TrojuhelnikVlastnosti {
    public static Scanner scan = new Scanner(System.in);
    public static final double EPSILON = 1E-5;
    public static double Ax, Ay, Bx, By, Cx, Cy;
    public static double a, b, c;
    public static int alfa, beta, gamma;
    public static void main(String[] args) {
        //Deklarace
        char run;
        
        //Zpracovani
        do{ run = scan.next().charAt(0);
            if (run == 'A' || run == 'a'){
                NacteniSouradnic();
                VzdalenostStran();
                Vlastnosti();
            }
            else if (run == 'N' || run == 'n');
            else run = 'A';
        }while (run == 'A' || run == 'a');
    }
    public static void NacteniSouradnic(){
        Ax = scan.nextDouble();
        Ay = scan.nextDouble();
        Bx = scan.nextDouble();
        By = scan.nextDouble();
        Cx = scan.nextDouble();
        Cy = scan.nextDouble();
    }
    public static void VzdalenostStran(){
        //Pythagorova veta
        a = Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2));
        b = Math.sqrt(Math.pow(Bx - Cx, 2) + Math.pow(By - Cy, 2));
        c = Math.sqrt(Math.pow(Cx - Ax, 2) + Math.pow(Cy - Ay, 2));
    }
    public static void Vlastnosti(){
        if ((Rovnost(a, b) == true) && (Rovnost(b, c) == true)){
            System.out.println("ROVNOSTRANNY");
        }
        else if ((a + b == c) || (a + c == b) || (b + c == a)){
            System.out.println("DEGENEROVANY");
        }
        else if (Pravouhlost()){
            if ((Rovnost(a, b) == true) || (Rovnost(a, c) == true) || (Rovnost(b, c) == true)){
                System.out.println("PRAVOUHLY ROVNORAMENNY"); 
            }
            else System.out.println("PRAVOUHLY"); 
        }
        else if ((Rovnost(a, b) == true) || (Rovnost(a, c) == true) || (Rovnost(b, c) == true)){
            System.out.println("ROVNORAMENNY");
        }
        else System.out.println("OBECNY");
    }
    public static boolean Rovnost(double a, double b){
        return Math.abs(a - b) < EPSILON;
    }
    public static boolean Pravouhlost(){
        double max, midd, min;
        if (c > b && c > a){
            max = c;
            midd = b;
            min = a;
        }
        else if (b > c && b > a){
            max = b;
            midd = c;
            min = a;
        }
        else{
            max = a;
            midd = b;
            min = c;
        }
        return max == Math.sqrt(Math.pow(midd, 2) + Math.pow(min, 2));
    }
}