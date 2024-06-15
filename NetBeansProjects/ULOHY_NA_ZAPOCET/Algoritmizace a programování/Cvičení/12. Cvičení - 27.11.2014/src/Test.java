import java.util.Scanner;
public class Test {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int m = 2;
        int n = 2;
        int [][] array = new int [m][n];
        int [][] array1 = MatrixTools.fillRandom(m, n, 1, 5);
        int [][] array2 = MatrixTools.fillRandom(m, n, 1, 5);
        MatrixTools.display(array1);
        MatrixTools.display(array2);
        array = MatrixTools.soucet(array1, array2);
        MatrixTools.display(array);
        array = MatrixTools.soucin(array1, array2);
        MatrixTools.display(array);
    }
}
