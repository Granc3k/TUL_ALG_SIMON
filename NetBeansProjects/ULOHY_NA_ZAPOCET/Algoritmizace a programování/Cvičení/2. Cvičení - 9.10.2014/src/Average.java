
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej dve cela cisla:");
        a = sc.nextFloat();
        b = sc.nextFloat(); 
        c = 0;
        
        c = (a+b)/2;
        System.out.format("Vysledek = %.2f %n", c);        
    }
}