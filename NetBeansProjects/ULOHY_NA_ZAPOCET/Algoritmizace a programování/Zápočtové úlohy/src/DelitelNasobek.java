//Designed by Tomas Moravec 
import java.util.Scanner;
public class DelitelNasobek {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Deklarace
        long a;
        long b;
        
        //Volani vypoctu a vypsani vysledku
        while((a = scan.nextInt()) > 0){        
            b = scan.nextInt();
            System.out.print(NejvetsiSpolecnyDelitel(a, b) + " ");
            System.out.println(NejmensiSpolecnyNasobek(a, b));
        }
    }
    public static long NejvetsiSpolecnyDelitel (long a, long b){
        //Alogirtmus pro vypocet nejvetsiho spolecneho delitele
        while (b != 0) {
            long meziVypocet = a;
            a = b;
            b = meziVypocet % b;
        }
        return a;
    }
    public static long NejmensiSpolecnyNasobek (long a, long b){
        //Algoritmus pro vypocet nejmensiho spolecneho nasobku
        return a * b / NejvetsiSpolecnyDelitel(a, b);
    }
}