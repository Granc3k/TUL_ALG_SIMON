import java.util.Scanner;

public class Sentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, trida;
        int rok;
        
        System.out.print("Jmeno: ");
        name = sc.next(); 
        System.out.print("\n");
        
        System.out.print("Rok narozeni: ");
        rok = sc.nextInt(); 
        System.out.print("\n");
        
        System.out.print("Trida: ");
        trida = sc.next(); 
        System.out.print("\n");
        
        rok = 2013-rok;
        
        System.out.println("Moje dite " +name+ " ma " +rok+ " let a chodi do tridy " +trida);
    }
}