import java.util.Scanner;

public class Rozsah {
    public static int pocet;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while ((pocet = sc.nextInt()) > 0) {
            if (pocet > 0) {
                Cal();
            }
        }
    }

    public static void Cal() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < pocet; i++) {
            int number = sc.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.print(min + " ");
        System.out.println(max);
    }
}