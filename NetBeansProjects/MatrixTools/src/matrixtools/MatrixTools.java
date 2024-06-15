/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixtools;

/**
 *
 * @author marts
 */
public class MatrixTools {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int[][] my = fill(4, 5, 10);
        my[3][1] = 5;
        String kokos = "Hanz ";

        kokos += " mrdke ";
        System.out.println(kokos);
        kokos = "";
        kokos = "kokos";
        System.out.println(kokos);
    }

    public static int[][] fill(int m, int n, int number) {
        int[][] a = new int[m][n];
        for (int i = 0; i < a.length; i++) { // m
            for (int j = 0; j < a[i].length; j++) { // n
                a[i][j] = number;
            }
        }
        return a;
    }

}
