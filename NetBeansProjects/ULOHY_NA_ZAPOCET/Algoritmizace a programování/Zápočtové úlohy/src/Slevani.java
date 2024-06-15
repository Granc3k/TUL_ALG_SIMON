//Designed by Tomas Moravec
import java.util.Scanner;
public class Slevani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeOfArray1;
        int sizeOfArray2;
        
        while ((sizeOfArray1 = scan.nextInt()) > 0){
            int[] array1 = new int [sizeOfArray1];
            for (int i = 0; i < sizeOfArray1; i++){
                array1[i] = scan.nextInt();
            }
            
            sizeOfArray2 = scan.nextInt();
            int[] array2 = new int [sizeOfArray2];
            for (int i = 0; i < sizeOfArray2; i++){
                array2[i] = scan.nextInt();
            }
            
            int[] array = new int [sizeOfArray1 + sizeOfArray2];
            int k = 0;
            for (int i = 0; i < array1.length; i++){
                array[k] = array1[i];
                k++;
            }
            for (int i = 0; i < array2.length; i++){
                array[k] = array2[i];
                k++;
            }
            
            
            array = bubbleSort(array);
            printArray(array);
        }
    }
    public static int[] bubbleSort (int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if(array[j-1] > array[j]){
                    int memory = array[j-1];
                    array[j-1] = array[j];
                    array[j] = memory;
                }
            }
        }
        return array;
    }
    
    public static void printArray (int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}