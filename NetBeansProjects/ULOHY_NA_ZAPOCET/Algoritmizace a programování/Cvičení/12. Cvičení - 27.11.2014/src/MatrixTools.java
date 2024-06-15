import java.util.Scanner;
public final class MatrixTools {
    private MatrixTools(){
        
    }
    public static int[][] fill(int m, int n, Scanner scan){
        int[][] array = new int [m][n];
            
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = scan.nextInt();
            }
        }
        return array;
    }
    public static int [][] fillRandom (int m, int n, int min, int max){
        int[][] array = new int [m][n];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random()*(max-min+1)+min);
            }
        }
        return array;
    }
    public static int [][] fillSequence (int m, int n){
        int[][] array = new int [m][n];
        int num = 1;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = num;
                num++;
            }
        }
        return array;
    }
    public static void display(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.format("%5d ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    public static void displayChar(char [][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.format(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    public static char [][] fillChar (int m, int n){
        char[][] array = new char [m][n];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (char)(Math.random()*(122-97+1)+97);
            }
        }
        return array;
    }
    public static int [][] fillDiagonal (int m, int n){
        int[][] array = new int [m][n];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i == j || j == (n-i-1)) array[i][j] = 1;
            }
        }
        return array;
    }
    public static boolean testDiagonalMain (int array [][]){
        for (int i = 0; i < array.length-1; i++){
            if (array[i][i] != array[i+1][i+1]) return false;  
        }
        return true;
    }
    public static boolean testDiagonalOther (int array [][]){     
        int vedlejsi = array[0][array[0].length-1];
        for (int i = 0; i < array.length-1; i++){
            if (array[i][array[i].length-1-i] != vedlejsi) return false;  
        }
        return true;
    }
    public static int[][] soucet (int array1[][], int array2[][]) throws Exception{
        if (array1.length != array2.length || array1[0].length != array2[0].length){
            throw new Exception("Chyba");
        }        
        int[][] array = new int [array1.length][array1[0].length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = array1[i][j] + array2[i][j];
            }
        } 
        return array;
    }
    public static int[][] soucin (int array1[][], int array2[][]) throws Exception{
        if (array1.length != array2.length || array1[0].length != array2[0].length){
            throw new Exception("Chyba");
        }   
        int soucet = 0;
        int[][] array = new int [array1.length][array1[0].length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                for (int k = 0; k < array[i].length; k++){
                    soucet = soucet + array1[i][k] * array2[k][j];
                }
                array[i][j] = soucet;
                soucet = 0;
            }
        } 
        return array;
    }
}