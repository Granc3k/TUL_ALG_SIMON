import java.util.Scanner;

public class TabulkaPoradi {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int radky = sc.nextInt();
        int sloupce = sc.nextInt();
        int hledanyRadek = sc.nextInt();
        int hledanySloupec = sc.nextInt();
        int[][] matice = new int[radky][sloupce];
        int temp = 1;
        for (int i = 0; i < radky; i++) {
            for (int j = 0; j < sloupce; j++) {
                matice[i][j] = temp;
                temp++;
            }
        }
        int hledaneCislo = matice[hledanyRadek - 1][hledanySloupec - 1];
        System.out.println(hledaneCislo);
    }
}