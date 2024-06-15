/**
 * Cvičení č. 3 (Výrazy) - Úloha č. 6
 * Napište program, který pro dva zadané vektory v prostoru vypočítá a 
 * vypíše skalární součin, vektorový součin a úhel těchto dvou vektorů.
 */

/* Import extérních knihoven */
import java.util.Arrays;  // Knihovna 'Arrays' obsahuje funkci pro tisk pole

public class Vectors3D {
    
    // Hlavní program
    public static void main(String[] args) {
        
        /* Deklarace POLE promenných typu integer (číslo) */
        int[] u = {2, 3, 5};  // Vektor v prostoru 'u'
        int[] v = {8, 3, 6};  // Vektor v prostoru 'v'
        
        // Výpočet a výpis
        System.out.println("Skalární součin: " + SkalarniSoucin(u,v));  // Výpis skalárního součinu
        System.out.println("Vektorový součin: " + Arrays.toString(VektorovySoucin(u, v)));  // Speciální metoda tisku pole
        System.out.println("Úhel vektorů: " + UhelVektoru(u, v) + "°");  // Výpis úhlu vektorů
    }
    
    /* Skalární součin dvou vektorů v prostoru (u . v) */
    public static int SkalarniSoucin(int[] u, int[] v){
        
        // Separace hodnot vektoru 'u'
        int ux = u[0];  // První složka vektoru 'u'
        int uy = u[1];  // Druhá složka vektoru 'u'
        int uz = u[2];  // Třetí složka vektoru 'u'
        
        // Separace hodnot vektoru 'v'
        int vx = v[0];  // První složka vektoru 'v'
        int vy = v[1];  // Druhá složka vektoru 'v'
        int vz = v[2];  // Třetí složka vektoru 'v'
        
        // Výpočet
        int uv = (ux*vx) + (uy*vy) + (uz*vz);  // Skalární součin dle vzorečku
        
        // Návrat
        return uv;  // Navrácení výpočtu zpět do hlavního programu
    }
    
    /* Vektorový součin dvou vektorů v prostoru (u x v) */
    public static int[] VektorovySoucin(int[] u, int[] v){
        
        // Separace hodnot vektoru 'u'
        int ux = u[0];  // První složka vektoru 'u'
        int uy = u[1];  // Druhá složka vektoru 'u'
        int uz = u[2];  // Třetí složka vektoru 'u'
        
        // Separace hodnot vektoru 'v'
        int vx = v[0];  // První složka vektoru 'v'
        int vy = v[1];  // Druhá složka vektoru 'v'
        int vz = v[2];  // Třetí složka vektoru 'v'
        
        // Výpočet
        int wx = (uy*vz) - (uz*vy);  // Výpočet souřadnice 'x' dle vzorečku
        int wy = (uz*vx) - (ux*vz) ;  // Výpočet souřadnice 'y' dle vzorečku
        int wz = (ux*vy) - (uy*vx);  // Výpočet souřadnice 'z' dle vzorečku
        int[] w = {wx, wy, wz};  // Spojení složek do vektoru dle vzorečku
        
        // Návrat
        return w;  // Navrácení výpočtu zpět do hlavního programu
    }
    
    /* Délka jednoho vektoru v prostoru ( |vektor| ) */
    public static double DelkaVektoru(int [] vektor){
        
        // Separace hodnot vektoru
        int x = vektor[0];  // První složka vektoru
        int y = vektor[1];  // Druhá složka vektoru
        int z = vektor[2];  // Třetí složka vektoru
        
        // Výpočet
        int x2 = x * x;  // 'x' na druhou
        int y2 = y * y;  // 'y' na druhou
        int z2 = z * z;  // 'z' na druhou
        int soucetMocnin = x2 + y2 + z2;  // Výpočet vnitřku odmocniny
        double vysledek = Math.sqrt(soucetMocnin);  // Výpočet odmocniny dle vzorečku (double = desetinne cislo)
        
        // Návrat
        return vysledek;  // Navrácení výpočtu zpět do hlavního programu
    }
    
    /* Úhel dvou vektorů v prostoru */
    public static int UhelVektoru(int [] u, int [] v){
        
        // Získání hodnot pro výpočet
        int citatel = SkalarniSoucin(u, v);  // Výpočet čitatele vzorečku
        double jmenovatel_u = DelkaVektoru(u);  // Výpočet části jmenovatele
        double jemnovatel_v = DelkaVektoru(v);  // Výpočet části jmenovatele
        
        // Výpočet
        double cosinusAlfa = citatel / (jmenovatel_u * jemnovatel_v);  // Výpočet cosinus dle vzorečku
        double radiany = Math.acos(cosinusAlfa);  // Uhel se počítá jako arcus cosinus uhlu cosinus
        double uhel = Math.toDegrees(radiany);
        int stupne = (int) uhel;  // Převod desetinného čísla (double) na celé (int)

        // Návrat
        return stupne;  // Navrácení výpočtu zpět do hlavního programu
    }
}
