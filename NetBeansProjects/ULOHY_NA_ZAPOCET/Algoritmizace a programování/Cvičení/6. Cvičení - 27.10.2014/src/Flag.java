import java.util.Scanner;
public class Flag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Zadejte velikost vlajky: ");
        DrawAFlag(scan.nextInt());
        System.out.print("\n\n");
    }
    public static void DrawAFlag(int velikost_sloupce){
        int velikost_radku = (velikost_sloupce/2)+2;
        if ((velikost_radku%2) == 0){velikost_radku++;}
        int prostredek = ((velikost_radku/2)+1);
        int pomocny_vypocet = 2;
        
        for (int radek = 1; radek <= velikost_radku; radek++){ System.out.print("\n");
            for (int sloupec = 1; sloupec <= velikost_sloupce; sloupec++){
                if (radek == 1 || radek == velikost_radku || sloupec == 1 || sloupec == velikost_sloupce){
                    System.out.print(" * ");} //Ohraniceni
                else if ((radek == sloupec && sloupec < prostredek) || ((radek-pomocny_vypocet) == sloupec) && (sloupec < prostredek) && (radek > prostredek)){
                    System.out.print(" * "); //Diagonaly
                    if ((radek-pomocny_vypocet) == sloupec){
                        pomocny_vypocet += 2;
                    }
                } //Modra barva
                else if ((radek == prostredek) && (sloupec >= radek)){System.out.print(" * ");} //Prostredek
                else {System.out.print("   ");} //Prazna mista
            }
        }
    }
}