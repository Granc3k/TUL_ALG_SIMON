//Designed by Tomas Moravec 
import java.util.Scanner;
public class CtyriCisla {
    public static Scanner scan = new Scanner(System.in);
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;
    public static int d = 0;
    public static void main(String[] args) {
        
        //Zadani poctu opakovani
        int opakovani = scan.nextInt(); 
        System.out.println();
        
        //Provedeni sortu * pocet opakovani
        for (int i = 0; i < opakovani; i++){
                Sort();
        }
    }
    
    //Sortovaci algoritmus bez pouziti Array
    public static void Sort(){
        
        //Nacteni neserazene posloupnosti
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        int poziceMax = 0;
        int poziceMin = 0;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int middOne = Integer.MAX_VALUE, middTwo = Integer.MIN_VALUE;
        
        //Zjisteni maxima a minima posloupnosti
        for (int i = 0; i < 4; i++){
            if (Case(i) > maximum){maximum = Case(i); poziceMax = i;}
            if (Case(i) < minimum){minimum = Case(i); poziceMin = i;}
        }
        
        //Sort zbylych dvou cisel
        for (int i = 0; i < 4; i++){
            if ((i != poziceMax) && (i != poziceMin) && (middOne == Integer.MAX_VALUE)){
                middOne = Case(i);
            }
            else if ((i != poziceMax) && (i != poziceMin)){
                middTwo = Case(i);
            }
        }
        
        //Konecny vypis posloupnosti
        a = maximum;
        b = Math.max(middOne, middTwo);
        c = Math.min(middOne, middTwo);
        d = minimum;
        System.out.println(d+" "+c+" "+b+" "+a);
    }
    
    //Snaha o napodobeni Array (pole) pomoci Switch
    public static int Case(int i){
        switch(i){
            case 0: return a;
            case 1: return b;
            case 2: return c;
            case 3: return d;
        }
        return 0;
    }
}