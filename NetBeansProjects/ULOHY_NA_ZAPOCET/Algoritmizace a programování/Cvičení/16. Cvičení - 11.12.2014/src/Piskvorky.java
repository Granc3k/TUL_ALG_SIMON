public class Piskvorky {
    public static char[][] matice;
    public static int pocetZnaku;
    public static int aktualniRadek;
    public static int aktualniSloupec;
    
    public static void main(String[] args) {
        
    }
   
    public static boolean KontrolaRadku (char[][] matice, int pocetZnaku, int aktualniRadek, int aktualniSloupec){
        int soucetZnaku = 1;
        char znak = matice[aktualniRadek][aktualniSloupec];
        boolean aktualniZnak = true;
        
        int i = 1;
        do{
            
            if ((aktualniSloupec - i >= 0) && (matice[aktualniRadek][aktualniSloupec - i] == znak)){
                soucetZnaku++;
                i++;
            }
            else aktualniZnak = false;
            
        }while (aktualniZnak == true);
        
        i = 1;
        do{
            if ((aktualniSloupec + i < matice[aktualniRadek].length) && (matice[aktualniRadek][aktualniSloupec + i] == znak)){
                soucetZnaku++;
                i++;
            }
            else aktualniZnak = false;
            
        }while (aktualniZnak == true);
        
        return soucetZnaku == pocetZnaku;
    }
    
    public static boolean KontrolaSloupce (char[][] matice, int pocetZnaku, int aktualniRadek, int aktualniSloupec){
        int soucetZnaku = 1;
        char znak = matice[aktualniRadek][aktualniSloupec];
        boolean aktualniZnak = true;
        
        int i = 1;
        do{
            
            if ((aktualniRadek - i >= 0) && (matice[aktualniRadek - i][aktualniSloupec] == znak)){
                soucetZnaku++;
                i++;
            }
            else aktualniZnak = false;
            
        }while (aktualniZnak == true);
        
        i = 1;
        do{
            if ((aktualniRadek + i < matice.length) && (matice[aktualniRadek + i][aktualniSloupec] == znak)){
                soucetZnaku++;
                i++;
            }
            else aktualniZnak = false;
            
        }while (aktualniZnak == true);
        
        return soucetZnaku == pocetZnaku;
    }
    
    public static boolean KontrolaHlavniDiagonay (char[][] matice, int pocetZnaku, int aktualniRadek, int aktualniSloupec){
        int soucetZnaku = 1;
        char znak = matice[aktualniRadek][aktualniSloupec];
        boolean aktualniZnak = true;
        
        int i = 1;
        do{
            
            if ((aktualniRadek - i >= 0) && (aktualniSloupec - i >= 0) && (matice[aktualniRadek - i][aktualniSloupec - i] == znak)){
                soucetZnaku++;
                i++;
            }
            else aktualniZnak = false;
            
        }while (aktualniZnak == true);
        
        i = 1;
        do{
            if ((aktualniRadek + i < matice.length) && (aktualniSloupec + i < matice[aktualniRadek].length) && (matice[aktualniRadek + i][aktualniSloupec + i] == znak)){
                soucetZnaku++;
                i++;
            }
            else aktualniZnak = false;
            
        }while (aktualniZnak == true);
        
        return soucetZnaku == pocetZnaku;
    }
    
    public static boolean KontrolaVedlejsiDiagonay (char[][] matice, int pocetZnaku, int aktualniRadek, int aktualniSloupec){
        int soucetZnaku = 1;
        char znak = matice[aktualniRadek][aktualniSloupec];
        boolean aktualniZnak = true;
        
        int i = 1;
        do{
            
            if ((aktualniRadek - i >= 0) && (aktualniSloupec + i < matice[aktualniRadek].length) && (matice[aktualniRadek - i][aktualniSloupec + i] == znak)){
                soucetZnaku++;
                i++;
            }
            else aktualniZnak = false;
            
        }while (aktualniZnak == true);
        
        i = 1;
        do{
            if ((aktualniRadek + i < matice.length) && (aktualniSloupec - i >= 0) && (matice[aktualniRadek + i][aktualniSloupec - i] == znak)){
                soucetZnaku++;
                i++;
            }
            else aktualniZnak = false;
            
        }while (aktualniZnak == true);
        
        return soucetZnaku == pocetZnaku;
    }
}