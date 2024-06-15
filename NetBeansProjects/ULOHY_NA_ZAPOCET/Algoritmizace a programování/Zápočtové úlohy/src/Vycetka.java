import java.util.Scanner;
public class Vycetka {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int pocetPlatidel;
        while((pocetPlatidel = scan.nextInt()) > 0){        
            Platidla(pocetPlatidel);
        }
    }
    public static void Platidla(int pocetPlatidel){
        int[] platidla = new int [pocetPlatidel];
        for(int i = 0; i < pocetPlatidel; i++){
            platidla[i] = scan.nextInt();
        }
        
        long castka;
        while((castka = scan.nextLong()) > 0){        
            VypocetPlatidel(platidla, castka);
        }
    }
    public static void VypocetPlatidel(int[] platidla, long castka){
        for(int i = 0; i < platidla.length; i++){
            System.out.print(castka / platidla[i] + " ");
            castka = castka % platidla[i];
        }
    }
}
