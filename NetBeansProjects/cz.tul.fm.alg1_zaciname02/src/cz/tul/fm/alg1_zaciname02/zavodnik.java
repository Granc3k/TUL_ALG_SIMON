
package cz.tul.fm.alg1_zaciname02;
import java.util.Scanner;

public class zavodnik {

    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        //
        int hodiny = 15;
        int minuty = 38;
        double sekundy = 42.069;
        //var
        double vypisSec = hodiny*3600+minuty*60+sekundy;
        //cal
        System.out.println("Závodník ujel závod za rekorních: "+hodiny+"h "+minuty+"min "+sekundy+"sec");
        System.out.println("V přepočtu na sekundy to jest: "+vypisSec);
        //out
        
        
        
        //zavodnik s Inputem
        System.out.println("Zadejte počet hodin: ");
        int hodinyIn = sc.nextInt();
        System.out.println("Zadejte počet minut: ");
        int minutyIn = sc.nextInt();
        System.out.println("Zadejte počet sekund: ");
        double sekundyIn = sc.nextDouble();
        //var
        double vypisSecIn = hodinyIn*3600+minutyIn*60+sekundyIn;
        
        //cal
        System.out.println("Závodník ujel závod za rekorních: "+hodinyIn+"h "+minutyIn+"min "+sekundyIn+"sec");
        System.out.println("V přepočtu na sekundy to jest: "+vypisSecIn);
        //out
    }
}
