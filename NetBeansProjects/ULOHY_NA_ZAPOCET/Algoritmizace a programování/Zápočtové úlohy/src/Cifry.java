//Designed by Tomáš Moravec
import java.util.Scanner;
public class Cifry {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Deklarace
        long number;
        
        //Volani vypoctu a vypsani vysledku
        while((number = scan.nextLong()) > 0){        
            System.out.print(CifernySoucet(number) + " ");
            System.out.println(CifernySoucin(number));
        }
    }
    public static long CifernySoucet (long number){
        //Deklarace
        long vysledek = 0;
        long meziVypocet;
        
        //Vypocet
        while (number > 0){
            meziVypocet = number % 10;
            vysledek += meziVypocet;
            number /= 10;
        }
        //Vraceni vysledku
        return vysledek;
        
    }
    public static long CifernySoucin (long number){
        //Deklarace
        long vysledek = 1;
        long meziVypocet;
        
        //Vypocet
        while (number > 0){
            meziVypocet = number % 10;
            vysledek *= meziVypocet;
            number /= 10;
        }
        
        //Vraceni vysledku
        return vysledek;
    }
}