import java.util.Scanner;

public class TabulkaPozice {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int radky = sc.nextInt();
        int sloupce = sc.nextInt();
        int hledaneCislo = sc.nextInt();
        int[][] matice = new int[radky][sloupce];
        int temp = 1;
        int hledanyRadek = 0;
        int hledanySloupec = 0;
        for (int i = 0; i < radky; i++) {
            for (int j = 0; j < sloupce; j++) {
                if (hledaneCislo == temp) {
                    hledanyRadek = i + 1;
                    hledanySloupec = j + 1;
                }
                matice[i][j] = temp;
                temp++;
            }
        }
        System.out.println(hledanyRadek + "  " + hledanySloupec);
    }
}