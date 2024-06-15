//Designed by Tomas Moravec
import java.util.Scanner;
public class Trideni {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfRepeat;
        
        while ((numberOfRepeat = scan.nextInt()) > 0){
            int[] array = new int [numberOfRepeat];
            for (int i = 0; i < numberOfRepeat; i++){
                array[i] = scan.nextInt();
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
