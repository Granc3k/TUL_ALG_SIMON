//Designed by Tomas Moravec 
import java.util.Scanner;
public class Delitele {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Deklarace
        int number;
        
        //Volani vypoctu a vypsani vysledku
        while((number = scan.nextInt()) > 0){        
            Delitele(number);
        }
    }
    public static void Delitele (int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}