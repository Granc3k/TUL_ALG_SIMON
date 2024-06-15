//Designed by Tomas Moravec
import java.util.Scanner;
public class Vyskyt {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int pocet = scan.nextInt();
        
        for (int i = 0; i < pocet; i++){
            CalcSec();
        }
    }
    public static void CalcSec(){
        boolean vyskytujeSe = false;
        int number;
        int count = 0;
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int opakovani = scan.nextInt();
        
        for (int i = 0; i < opakovani; i++){
            number = scan.nextInt();
            
            if ((number == a) && (count == 0)){
                count = 1;
            }
            else if (count == 1){
                if (number == b){
                    vyskytujeSe = true;
                    count = 2;
                }
                else if (number == a){
                    count = 1;
                }
                else{
                    count = 0;
                }
            }
            else{
                count = 0;
            }
        }
        
        System.out.println(vyskytujeSe);
    }
}