package Treti;
import java.util.Scanner;
public class Divisor {
    public static void main(String[] args) {
        //Inputs declaration
        int a = 0, b = 0;
        
        //Program input
        Scanner scan = new Scanner(System.in);
        System.out.print("Zadejte dve cisla ktera se budou delit A/B: ");
        a = scan.nextInt(); 
        b = scan.nextInt();
        
        //Program calculation
        boolean isDivisible = a%b == 0;
                
        //Program output
        System.out.println(isDivisible);
    }
}
