import java.util.Scanner;
public class DveMatice {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfSequence = scan.nextInt();
        for (int i = 0; i < numberOfSequence; i++){
            int sizeOfArrayOne = scan.nextInt() * scan.nextInt();
            int[] arrayOne = new int [sizeOfArrayOne];
            arrayOne = readArray(arrayOne);
            arrayOne = bubbleSort(arrayOne);
                        
            int sizeOfArrayTwo = scan.nextInt() * scan.nextInt();
            int[] arrayTwo = new int [sizeOfArrayTwo];
            arrayTwo = readArray(arrayTwo);
            arrayTwo = bubbleSort(arrayTwo);
            
            System.out.println(compareArrays(arrayOne, arrayTwo));
        }
    }
    public static int compareArrays(int[] arrayOne, int[] arrayTwo){
        if (arrayOne.length != arrayTwo.length) return 0;
        
        for (int i = 0; i < arrayOne.length; i++){
            if (arrayOne[i] != arrayTwo[i]) return 0;
        }
        
        return 1;
    }
    public static int[] readArray(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        
        return array;
    }
    public static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] < array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        
        return array;
    }   
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
            
        }
        System.out.println();
    }
}
