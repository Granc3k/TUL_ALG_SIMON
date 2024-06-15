import java.util.Scanner;

public class RepeatApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        char next = 'a';
        boolean isEven;

        /*
         do {
         System.out.print("Zadej cislo: ");
         number = sc.nextInt();
         isEven = (number % 2 == 0);
         System.out.println("Cislo " + number + (isEven ? " je sude." : " je liche."));
         System.out.print("Chcete pokracovat? A/N: ");
         next = sc.next().charAt(0);
         } while (next == 'a' || next == 'A');
         */
        
        while (next == 'a' || next == 'A') {
            System.out.print("Zadej cislo: ");
            number = sc.nextInt();
            if (number <= 0) {
                System.exit(0);
            } else {
                isEven = (number % 2 == 0);
                System.out.println("Cislo " + number + (isEven ? " je sude." : " je liche."));
                System.out.print("Chcete pokracovat? A/N: ");
                next = sc.next().charAt(0);
            }
        }
    }
}