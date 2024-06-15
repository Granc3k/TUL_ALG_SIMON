import java.util.Scanner;

public class TestCyklickePosloupnosti {
    public static Scanner sc = new Scanner(System.in);
    public static int vysledek;

    public static void main(String[] args) {
        int pocet = sc.nextInt();

        for (int i = 0; i < pocet; i++) {
            Urceni();
        }
    }

    public static void Urceni() {
        int delka = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int prev = Integer.MIN_VALUE;
        int act;
        boolean cont = true;

        if (delka == 1) {
            System.out.println(sc.nextInt() + 1);
        } else {
            for (int i = 0; i < delka; i++) {
                act = sc.nextInt();
                if (prev == Integer.MIN_VALUE) {
                    prev = act;
                } else if (cont) {
                    if (act == prev + 1) {
                        if (act > max) {
                            max = act;
                        }
                        prev = act;
                    } else if (act == prev || act > prev + 1) {
                        cont = false;
                        max = Integer.MIN_VALUE;
                    } else {
                        prev = Integer.MIN_VALUE;
                    }
                }
            }
            if (max == Integer.MIN_VALUE) {
                System.out.println("-1");
            } else {
                System.out.println(max + 1);
            }
        }
    }
}