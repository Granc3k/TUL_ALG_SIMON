import java.util.Scanner;
public class PruhovaMatice {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfRepeat = scan.nextInt();
        for (int i = 0; i < numberOfRepeat; i++){
            int[][] matrix = new int [scan.nextInt()][scan.nextInt()];
            matrix = loadMatrix(matrix);
            
            if (matrix.length < 2 || matrix[0].length < 2) System.out.println("1");
            else if (isStrippedColumn(matrix)) System.out.println("1");
            else if (isStrippedRow(matrix)) System.out.println("1");
            else if (isStrippedDiagonalOther(matrix)) System.out.println("1");
            else if (isStrippedDiagonalMain(matrix)) System.out.println("1");
            else System.out.println("0");
        }
    }
    public static int[][] loadMatrix (int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }
    
    public static boolean isStrippedColumn (int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length - 1; j++){
                if (matrix[i][j] != matrix[i][j+1]) return false;
            }
        }
        return true;
    }
    public static boolean isStrippedRow (int[][] matrix){
        for (int i = 0; i < matrix[i].length; i++){
            for (int j = 0; j < matrix.length - 1; j++){
                if (matrix[j][i] != matrix[j+1][i]) return false;
            }
        }
        return true;
    }
    public static boolean isStrippedDiagonalMain (int[][] matrix){
        for (int i = 0; i < matrix.length - 1;i++){
            for (int j = 0; j < matrix[i].length - 1; i++){
                if (matrix[i][j] != matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
    public static boolean isStrippedDiagonalOther (int[][] matrix){
        for (int i = 0; i < matrix.length - 1; i++){
            for (int j = 1; j < matrix[i].length; j++){
                if (matrix[i][j] != matrix[i+1][j-1]) return false;
            }
        }
        return true;
    }
}