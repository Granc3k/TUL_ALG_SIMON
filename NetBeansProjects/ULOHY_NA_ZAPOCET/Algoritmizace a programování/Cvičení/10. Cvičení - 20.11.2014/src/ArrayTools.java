public class ArrayTools {
    public static void main(String[] args) {
        int[] array = fillRandom(20, 0, 10);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static int [] swapValues (int[] array){
        for (int i = 0; i < (array.length/2); i++){
            int backup = array[array.length-1-i];
            array[array.length-1-i] = array[i];
            array[i] = backup;
        }
        return array;
    }
    public static int [] fillRandom (int values, int min, int max){
        int[] array = new int [values];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*(max-min+1)+min);
        }   
        return array;
    }    
    public static void write (int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static boolean Sorted (int[] array){
        int up = 0;
        int down = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] > array[i-1]){
                up++;
            } 
            else if (array[i] < array[i-1]){
                down++;
            }
        }
        return (up == array.length) || (down == array.length);
    }
    public static int [] Copy (int[] array){
        int[] arrayNew = new int [array.length];
        System.arraycopy(array, 0, arrayNew, 0, array.length);
        return arrayNew;
    }
}