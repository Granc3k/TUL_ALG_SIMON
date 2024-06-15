
import java.util.Random;

public class Pexeso {
    public static boolean TestPexeso(int[][] matrix){
        if ((matrix.length * matrix[0].length) %2 != 0){
            return false;
        }
        if (1==2){ //Nejvetsi cislo nesmi byt vetsi nez 1 - n (n = length/2)
            return false;
        }
        if (1==2){ //Kazde cislo je v paru: Udelame jednorozmerne pole a index bude pocet cisel rovnajicich se indexu
            return false;
        }
        return true;
    }
    public static int[][] CreateMatrix(int row, int column){
        int[] array = FillArray(row*column);
        array = Shuffle(array);
        int[][] matrix = ArrayToMatrix(array, row, column);
        return matrix;
    }
    public static int[] FillArray(int length){
        if((length%2) != 0){
            throw new IllegalArgumentException("Delka pole musi byt sude cislo");
        }
        
        int[] array = new int [length];
        int max = length/2;
        int min = 1;
        
        for(int i = 0; i < array.length; i += 2){
            array[i] = (int)(Math.random()*(max-min+1)+min);
            array[i+1] = array[i];
        }
        return array;
    }
    public static int[] Shuffle(int[] array){
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
          int index = rnd.nextInt(i + 1);
          int a = array[index];
          array[index] = array[i];
          array[i] = a;
        }
        return array;
    }
    public static int[][] ArrayToMatrix(int[] array, int row, int column){
        if((row*column) != array.length){
            throw new IllegalArgumentException("Spatne zadane rozmery");
        }
        int[][] matrix = new int [row][column];
        
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                matrix[i][j] = array[i*column+j];
            }
        }
        
        return matrix;
    }
}