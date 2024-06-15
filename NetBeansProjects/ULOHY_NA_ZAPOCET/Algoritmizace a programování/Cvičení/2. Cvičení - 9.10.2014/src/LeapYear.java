import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = 0, a = 0;

        System.out.print("Zadej rok: ");
        year = scan.nextInt();
        System.out.print("\n");

        boolean isLeap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        
        if (isLeap == true) {
            System.out.print("Rok " + year + " je prestupny \n");
        } else {
            System.out.print("Rok " + year + " neni prestupny \n");
        }
    }
}
