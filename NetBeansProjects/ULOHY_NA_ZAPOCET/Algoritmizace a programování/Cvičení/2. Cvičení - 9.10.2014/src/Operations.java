import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej dve cela cisla:");
        a = sc.nextFloat();
        b = sc.nextFloat(); 
        c = 0;
        
        c = a+b;
        System.out.println("A + B = " +c);       
        
        c = a*b;
        System.out.println("A * B = " +c); 
        
        c = a/b;
        System.out.println("A / B = " +c); 
        
        c = a%b;
        System.out.println("A % B = " +c); 
        
        
    }  
}
