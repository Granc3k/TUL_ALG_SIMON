//Designed by Tomas Moravec 
import java.util.Scanner;
public class Kvadranty {
    public static Scanner scan = new Scanner(System.in);
    public static int prvniKvadrant = 0;
    public static int druhyKvadrant = 0;
    public static int tretiKvadrant = 0;
    public static int ctvrtyKvadrant = 0;
    public static void main(String[] args) {
        //Deklarace
        double x;
        double y;
        int pocetOpakovani;
        
        //Zpracovani
        pocetOpakovani = scan.nextInt();
        for (int i = 0; i < pocetOpakovani; i++){
            x = scan.nextDouble();
            y = scan.nextDouble();
            
            kvadrant(x, y);
        }
        
        //Vypis
        System.out.println(prvniKvadrant+"  "+druhyKvadrant+"  "+tretiKvadrant+"  "+ctvrtyKvadrant);
    }
    public static void kvadrant (double x, double y){
        if ((x >= 0) && (y >= 0)) prvniKvadrant++;
        else if ((x <= 0) && (y >= 0)) druhyKvadrant++;
        else if ((x <= 0) && (y <= 0)) tretiKvadrant++;
        else if ((x >= 0) && (y <= 0)) ctvrtyKvadrant++;
    }
}