
import java.util.Scanner;

public class Druhy {

    public static void main(String[] args) {     
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej dve cela cisla:");
        a = sc.nextInt(); 
        b = sc.nextInt(); 
        
        System.out.println("Pred prohozenim:");
        System.out.println("A = " +a);
        System.out.println("B = " +b);
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("Po prohozeni:");
        System.out.println("A = " +a);
        System.out.println("B = " +b);
    }
}
