//Designed by Tomas Moravec
import java.util.Scanner;
public class Rozsah {
    public static int pocet;
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while ((pocet = scan.nextInt()) > 0){
            if (pocet > 0){
                CalcSec();
            }
        }
    }
    public static void CalcSec(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < pocet; i++){
            int number = scan.nextInt();
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }
        
        System.out.print(min + " ");
        System.out.println(max);
    }
}