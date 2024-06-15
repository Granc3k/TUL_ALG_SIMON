import java.util.Scanner;

public class Vycetka {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pocet;
        while ((pocet = sc.nextInt()) > 0) {
            Platidla(pocet);
        }
    }

    public static void Platidla(int pocet) {
        int[] vypis = new int[pocet];
        for (int i = 0; i < pocet; i++) {
            vypis[i] = sc.nextInt();
        }

        long castka;
        while ((castka = sc.nextLong()) > 0) {
            VypocetPlatidel(vypis, castka);
        }
    }

    public static void VypocetPlatidel(int[] vypis, long castka) {
        for (int i = 0; i < vypis.length; i++) {
            System.out.print(castka / vypis[i] + " ");
            castka = castka % vypis[i];
        }
    }
}
