public class Desetiminutovka {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        
        int[] pole = increase(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(pole[i]+" ");
        }
    }
    public static int[] generate(int size){
        int[] array = new int [size];
        for (int i = 0; i < size; i++){
            array[array.length - 1 - i] = 2*(i+1);
        }
        return array;
    }
    
    public static int[] increase(int[] array){
        for (int i = 1; i < array.length; i += 2){
            array[i] += 2;
        }
        return array;
    }
}
