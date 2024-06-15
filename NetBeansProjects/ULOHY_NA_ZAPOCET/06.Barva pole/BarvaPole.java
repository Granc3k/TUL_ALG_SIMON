import java.util.Scanner;

public class BarvaPole {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean jeBila;
        int pozice = 1;
        while (pozice >= 0) {
            pozice = scan();
            if (pozice >= 0) {
                jeBila = pozice % 2 == 0;
                System.out.println((jeBila) ? "BILA" : "CERNA");
            }
        }
    }

    public static int scan() {
        int pozice = 0;
        int temp = 0;
        for (int i = 0; i < 2; i++) {
            temp = sc.nextInt();
            if (temp >= 0) {
                pozice += temp;
            } else {
                pozice = temp;
                i = 3;
            }
        }
        return pozice;
    }
}