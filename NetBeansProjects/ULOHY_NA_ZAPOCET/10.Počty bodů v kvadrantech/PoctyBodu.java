import java.util.Scanner;

public class PoctyBodu {
    public static Scanner sc = new Scanner(System.in);
    public static int prvniKvadrant = 0;
    public static int druhyKvadrant = 0;
    public static int tretiKvadrant = 0;
    public static int ctvrtyKvadrant = 0;

    public static void main(String[] args) {
        double x;
        double y;
        int opakovani;
        opakovani = sc.nextInt();
        for (int i = 0; i < opakovani; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();

            kvadrant(x, y);
        }
        System.out.println(prvniKvadrant + "  " + druhyKvadrant + "  " + tretiKvadrant + "  " + ctvrtyKvadrant);
    }

    public static void kvadrant(double x, double y) {
        if ((x >= 0) && (y >= 0))
            prvniKvadrant++;
        else if ((x <= 0) && (y >= 0))
            druhyKvadrant++;
        else if ((x <= 0) && (y <= 0))
            tretiKvadrant++;
        else if ((x >= 0) && (y <= 0))
            ctvrtyKvadrant++;
    }
}