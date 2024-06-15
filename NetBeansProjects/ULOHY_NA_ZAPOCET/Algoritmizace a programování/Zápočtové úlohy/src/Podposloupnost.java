//Designed by Tomas Moravec
import java.util.Scanner;
public class Podposloupnost {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int pocet;
        
        while((pocet = scan.nextInt()) > 0){  
            CalcSec(pocet);
        }
    }
    public static void CalcSec(int pocet){
        int number;
        int number0 = Integer.MIN_VALUE;
        int sum = 0;
        int nejvetsiSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < pocet; i++){
            number = scan.nextInt();
                    
            if (number0 == Integer.MIN_VALUE){ number0 = number; sum++; }
            else{
                if (number >= number0){
                    number0 = number;
                    sum++;
                }
                else{
                    if (sum > nejvetsiSum){
                        nejvetsiSum = sum;
                    }
                    number0 = number;
                    sum = 1;
                }
            }
        }
        if (sum > nejvetsiSum){
            nejvetsiSum = sum;
        }
        System.out.println(nejvetsiSum);
    }
}