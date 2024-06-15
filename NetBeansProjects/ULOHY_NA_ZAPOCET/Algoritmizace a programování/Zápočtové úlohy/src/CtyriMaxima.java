//Designed by Tomas Moravec
import java.util.Scanner;
public class CtyriMaxima {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int pocet = scan.nextInt();
        
        for (int i = 0; i < pocet; i++){
            CalcSec();
        }
    }
    public static void CalcSec(){
        int number;
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int max4 = Integer.MIN_VALUE;
        
        int sumOfMax1 = 0;
        int sumOfMax2 = 0;
        int sumOfMax3 = 0;
        int sumOfMax4 = 0;
        
        while((number = scan.nextInt()) > 0){
            if (number > max1){
                max4 = max3;
                max3 = max2;
                max2 = max1;
                max1 = number;
                
                sumOfMax4 = sumOfMax3;
                sumOfMax3 = sumOfMax2;
                sumOfMax2 = sumOfMax1;
                sumOfMax1 = 1;
            }
            else if (number == max1){
                sumOfMax1++;
            }
            else if (number > max2){
                max4 = max3;
                max3 = max2;
                max2 = number;
                
                sumOfMax4 = sumOfMax3;
                sumOfMax3 = sumOfMax2;
                sumOfMax2 = 1;
            }
            else if (number == max2){
                sumOfMax2++;
            }
            else if (number > max3){
                max4 = max3;
                max3 = number;
                
                sumOfMax4 = sumOfMax3;
                sumOfMax3 = 1;
            }
            else if (number == max3){
                sumOfMax3++;
            }
            else if (number > max4){
                max4 = number;
                
                sumOfMax4 = 1;
            }
            else if (number == max4){
                sumOfMax4++;
            }
        }
        
        System.out.print(max1 + " ");
        System.out.println(sumOfMax1);
        
        System.out.print(max2 + " ");
        System.out.println(sumOfMax2);
        
        System.out.print(max3 + " ");
        System.out.println(sumOfMax3);
        
        System.out.print(max4 + " ");
        System.out.println(sumOfMax4);
    }
}