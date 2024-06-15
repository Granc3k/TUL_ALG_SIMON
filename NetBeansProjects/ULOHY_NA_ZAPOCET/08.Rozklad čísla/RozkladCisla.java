import java.util.Scanner;

public class Rozklad {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        while ((number = sc.nextInt()) > 0) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                while (number % i == 0) {
                    number = number / i;
                    System.out.print(i + " ");
                }
            }
            if (number > 1) {
                System.out.println(number);
            } else {
                System.out.println();
            }
        }
    }
}