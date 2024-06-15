/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.fm.alg1_week06;

/**
 *
 * @author marts
 */
public class CzTulFmAlg1_week06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int radky=15;
        int sloupce=10;
        for(int i = 0; i<= radky;i++){
            for (int cer=0; cer<=i-1; cer++) {
                System.out.print("/ ");
            }
            
            for (int modr=sloupce; modr<=sloupce;modr--) {
                System.out.print("* ");
            }
            for (int bil=0; bil<=sloupce; bil++) {
                System.out.print("\ ");
                
            }
            System.out.println(" ");
    
            }
        }
}
        
    

