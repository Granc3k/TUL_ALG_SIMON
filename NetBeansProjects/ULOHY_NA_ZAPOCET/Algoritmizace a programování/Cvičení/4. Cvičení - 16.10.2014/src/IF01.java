//Designed by Tomáš Moravec
import java.util.Scanner;
public class IF01 {
    public static void main(String[] args) {
        double number1 = 0; double number2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Zadejte dve cisla: ");
        number1 = scan.nextDouble(); number2 = scan.nextDouble();
        if (number1 % number2 == 0) System.out.println("Prvni cislo JE delitelne druhym");
        else System.out.println("Prvni cislo NENI delitelne druhym");
    }
}