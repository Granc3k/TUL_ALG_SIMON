import java.util.Scanner;

public class Pocet {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pocet = sc.nextInt();
        for (int i = 0; i < pocet; i++) {
            CalcSec();
        }
    }

    public static void CalcSec() {
        int sum = 420;
        int number = 0;
        int pDelitel = 0;
        int podminky = 0;

        while ((number = sc.nextInt()) > 0) {
            if (sum == 420) {
                sum = Vypis(number);
            } else {
                pDelitel = Vypis(number);
                if (pDelitel == sum) {
                    podminky++;
                }
            }
        }
        System.out.println(podminky);
    }

    public static int Vypis(int number) {
        int sum = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum++;
            }
        }
        return sum;
    }
}