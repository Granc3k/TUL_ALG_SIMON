//Designed by Tomas Moravec
import java.util.Scanner;
public class Vlastnost {
    public static Scanner scan = new Scanner(System.in);
    public static int vysledek;
    public static void main(String[] args) {
        int pocet = scan.nextInt();
        
        for (int i = 0; i < pocet; i++){
            UrceniVlastnosti();
        }
    }
    public static void UrceniVlastnosti(){
        int delkaPosloupnosti = scan.nextInt();
        int nejvetsi = Integer.MIN_VALUE;
        int predchozi = Integer.MIN_VALUE; 
        int aktualni;
        boolean cont = true;
        
        if (delkaPosloupnosti == 1){
            System.out.println(scan.nextInt()+1);
        }
        else{
            for (int i = 0; i < delkaPosloupnosti; i++){
                aktualni = scan.nextInt();
                if (predchozi == Integer.MIN_VALUE) {
                    predchozi = aktualni;
                }
                else if (cont) {
                    if (aktualni == predchozi+1){
                        if (aktualni > nejvetsi){
                            nejvetsi = aktualni;
                        }
                        predchozi = aktualni;
                    }
                    else if (aktualni == predchozi || aktualni > predchozi+1){
                        cont = false;
                        nejvetsi = Integer.MIN_VALUE;
                    }
                    else{
                        predchozi = Integer.MIN_VALUE;
                    }
                }
            }
            if (nejvetsi == Integer.MIN_VALUE){
                System.out.println("-1");
            }
            else{
                System.out.println(nejvetsi+1);
            }
        }
    }
}