/*
-------------- CHYBY ------------- 
1. Pri použití do-while s nulovou položkou pracujete a až potom ukončite nákup
 - Opraveno
2. Chýba max, EUR
 - Opraveno
3. Chýba bonus
 - Opraveno
4. Chýba výčetka
 - Opraveno
5. Chýba formátovanie, konštanty
 - Opraveno
6. Chýba záporná platba
 - Opraveno
---------- Vse opraveno ----------
*/
import java.util.Scanner;
public class Kasa_TomMor {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        char again = 'n';
        do {
            int[] platidla = new int [3];
            platidla[0] = 50;
            platidla[1] = 10;
            platidla[2] = 1;
            
            int DPH = 0;
            int samolepky = 0;
            final int bonus = 250;
            double cena = 1;
            double maxCena = 0;
            final double euro = 28;
            double cenaEuro = 0;
            double cenabezDPH = 0;
            double cenasDPH = 0;
            final double zakladniDPH = 21;
            final double snizeneDPH = 15;
            
            while (cena != 0) {
                System.out.print("Zadejte prosim cenu a sazbu DPH (0 = 21 / 1 = 15): ");
                cena = scan.nextDouble();
                if (cena > maxCena) maxCena = cena;
                if (cena < 0){
                    DPH = scan.nextInt();
                    System.out.println("Zadali zapornou platbu...");
                }
                else if (cena != 0) {
                    DPH = scan.nextInt();
                    cenasDPH += cena;
                    if (DPH == 0) cenabezDPH += (cena/(zakladniDPH+100))*100;
                    else if (DPH == 1) cenabezDPH += (cena/(snizeneDPH+100))*100;
                    else System.out.println("Zadali jste spatnou sazbu DPH");
                }
            }
            if (cenasDPH > 0){
                samolepky = ((int)cenasDPH)/bonus;
                cenaEuro = cenasDPH/euro;
                System.out.format("-- Cena nakupu bez DPH: %.2f Kc \n", cenabezDPH);
                System.out.format("-- Cena nakupu s DPH:   %.2f Kc \n", cenasDPH);
                System.out.format("-- Cena nakupu v EUR:   %.2f EUR \n", + cenaEuro);
                System.out.format("-- Max. cena polozky:   %.2f Kc \n", maxCena);
                System.out.println("-- Min. pocet minci:    " + VypocetPlatidel(platidla, cenasDPH));
                System.out.print((cenasDPH >= bonus)? "-- Mate narok na " : "Nemate narok na samolepky \n");
                if (cenasDPH >= bonus) System.out.println(samolepky + " samolepky");
            }
            else{
                System.out.println("Nakup zrusen... ");
            } 
            System.out.println("Chcete pokracovat v zadavani? (a/n): ");
            again = scan.next().charAt(0);
        } while ((again == 'a') || (again == 'A'));
    }
    public static int VypocetPlatidel(int[] platidla, double castka){
        int min = 0;
        for(int i = 0; i < platidla.length; i++){
            if (castka >= platidla[i]){
                min = min + (int)(castka/platidla[i]);
                castka = castka%platidla[i];
            }
            if (castka == 0) i = platidla.length;
        }
        return min;
    }
}