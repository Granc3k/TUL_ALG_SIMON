/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.tul.fm.alg1_zaciname02;
import java.util.Scanner;
/**
 *
 * @author marts
 */
public class mince {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int stoV,padeV,dvackaV,desetV,petV,dvaV,jednaV;
            System.out.println("Zadejte částku, kterou chcete zaplatit: ");
            int castka = sc.nextInt();
            int papir;
            int mince;
            //var
            stoV = castka/100;
            castka = castka%100;
            papir=stoV;
                        
            padeV = castka/50;
            castka = castka%50;
            mince=padeV;  
            
            dvackaV = castka/20;
            castka = castka%20;
            mince=mince+dvackaV; 
            
            desetV = castka/10;
            castka = castka%10;
            mince=mince+desetV; 
            
            petV = castka/5;
            castka= castka%5;
            mince=mince+petV; 
            
            dvaV = castka/2;
            castka= castka%2;
            mince=mince+dvaV; 
            
            jednaV = castka;
            mince=mince+jednaV; 
            //cal
            System.out.printf("100: %d, 50: %d, 20: %d, 10: %d, 5: %d, 2: %d, 1: "
            + "%d\n",stoV,padeV,dvackaV,desetV,petV,
            dvaV,jednaV);
            System.out.println("Uživatel použil: "+papir+" bankovek a "+mince+
                    " mincí");
    }
    
}
