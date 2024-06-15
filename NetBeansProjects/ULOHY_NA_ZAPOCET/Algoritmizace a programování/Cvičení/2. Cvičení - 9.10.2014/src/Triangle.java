import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej tri cisla:");
        a = sc.nextInt(); 
        b = sc.nextInt(); 
        c = sc.nextInt(); 
        
        if (a<(b+c) && b<(a+c) && c<(a+b)) System.out.println("Pravda");
        else System.out.println("Nepravda");
    }
}
