
import java.util.Scanner;


public class Vyskyt {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pocet = sc.nextInt();

        for (int i = 0; i < pocet; i++) {
            Cal();
        }
    }

    public static void Cal() {
        boolean vyskyt = false;
        int num;
        int count = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int opakovani = sc.nextInt();

        for (int i = 0; i < opakovani; i++) {
            num = sc.nextInt();

            if ((num == a) && (count == 0)) {
                count = 1;
            } else if (count == 1) {
                if (num == b) {
                    vyskyt = true;
                    count = 2;
                } else if (num == a) {
                    count = 1;
                } else {
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        System.out.println(vyskyt);
    }
}