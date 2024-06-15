//Designed by Tomas Moravec 
import java.util.Scanner;
public class Rozklad {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Deklarace
        int number;
        
        //Volani vypoctu a vypsani vysledku
        while((number = scan.nextInt()) > 0){        
            Faktorizace(number);
        }
    }
    public static void Faktorizace(int number){
        //Alogiritmus pro vypocet faktorizace
        for (int i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                number = number / i;
                System.out.print(i + " ");
            }
        }
        //Zbytek je take prvocislo, pokud je vetsi nez jedna
        if (number > 1) {
            System.out.println(number);
        }
        else{
            System.out.println();
        }
    }
}