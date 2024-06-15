import java.util.Scanner;

public class DelitelNasobek {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long a, b, aDeleni, bDeleni, delitel, nasobek;
        while ((a = sc.nextLong()) > 0) {
            aDeleni = a;
            b = sc.nextLong();
            bDeleni = b;
            while (bDeleni != 0) {
                long meziVypocet = aDeleni;
                aDeleni = bDeleni;
                bDeleni = meziVypocet % bDeleni;
            }
            delitel = aDeleni;
            nasobek = (a * b) / delitel;
            System.out.println(delitel + " " + nasobek);
        }
    }
}