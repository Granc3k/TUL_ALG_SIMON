
import java.util.Random;
public class Permutace {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        Permutace(array);
    }
    public static void Permutace(int[] array){
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
          int index = rnd.nextInt(i + 1);
          // Simple swap
          int a = array[index];
          array[index] = array[i];
          array[i] = a;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}