import java.util.Scanner;

public class Cifry {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long number, vyslSoucet, vyslSoucin, soucet, soucin;

        while ((number = sc.nextLong()) > 0) {
            soucet = number;
            soucin = number;
            long meziVypocet;
            vyslSoucet = 0;
            while (soucet > 0) {
                meziVypocet = soucet % 10;
                vyslSoucet += meziVypocet;
                soucet /= 10;
            }
            vyslSoucin = 1;
            meziVypocet = 0;
            while (soucin > 0) {
                meziVypocet = soucin % 10;
                vyslSoucin *= meziVypocet;
                soucin /= 10;
            }
            System.out.println(vyslSoucet + " " + vyslSoucin);
        }
    }
}