
package cz.tul.fm.alg1_zaciname02;
import java.util.Scanner;

public class prepocetSekund {
    public static void main(String[] args) {
        System.out.println("Zadejte počet libovolný počet sekund, které chcete převést: ");
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        double vypisHod = sec/3600;
        
        System.out.println("Přepočet sekund na hodiny vyšel: " + vypisHod+"h");
        int hodiny=sec/3600;
        sec=sec%3600;
        int minuty=sec/60;
        sec=minuty%60;
        
        System.out.println("Přepočet na HH:MM:SS je: "+hodiny+":"+minuty+":"+sec);
        
    } 
}

