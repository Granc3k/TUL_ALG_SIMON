import java.util.Scanner;

public class CtyriCisla {
    public static Scanner scan = new Scanner(System.in);
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;
    public static int d = 0;

    public static void main(String[] args) {
        int opakovani = scan.nextInt();
        System.out.println();
        for (int j = 0; j < opakovani; j++) {
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            d = scan.nextInt();
            int poziceMax = 0;
            int poziceMin = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int middOne = Integer.MAX_VALUE, middTwo = Integer.MIN_VALUE;
            for (int i = 0; i < 4; i++) {
                if (Case(i) > max) {
                    max = Case(i);
                    poziceMax = i;
                }
                if (Case(i) < min) {
                    min = Case(i);
                    poziceMin = i;
                }
            }
            for (int i = 0; i < 4; i++) {
                if ((i != poziceMax) && (i != poziceMin) && (middOne == Integer.MAX_VALUE)) {
                    middOne = Case(i);
                } else if ((i != poziceMax) && (i != poziceMin)) {
                    middTwo = Case(i);
                }
            }
            a = max;
            b = Math.max(middOne, middTwo);
            c = Math.min(middOne, middTwo);
            d = min;
            System.out.println(d + " " + c + " " + b + " " + a);
        }
    }

    public static int Case(int i) {
        switch (i) {
            case 0:
                return a;
            case 1:
                return b;
            case 2:
                return c;
            case 3:
                return d;
        }
        return 0;
    }
}