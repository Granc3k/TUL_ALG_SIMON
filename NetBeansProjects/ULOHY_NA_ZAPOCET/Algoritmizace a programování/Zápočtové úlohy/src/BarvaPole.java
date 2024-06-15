//Designed by Tomas Moravec 
import java.util.Scanner;
public class BarvaPole {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Deklarace
        boolean isWhite;
        int position;
        
        //Vypocet
        do{
            position = ScanPosition();
            
            //Vysledek
            if (position >= 0){
                isWhite = isPositionWhite(position);
                System.out.println((isWhite)? "  BILA": "  CERNA");
            }
        }while(position >= 0);
    }
    
    public static int ScanPosition(){
        int position = 0; 
        int check = 0;
        for (int i = 0; i < 2; i++){
            check = scan.nextInt();
            if (check >= 0){
                position += check;
            }
            else{
                position = check;
                i = 10;
            }
        }
        return position;
    }
    
    public static boolean isPositionWhite(int position){
        if (position % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}