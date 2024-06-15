/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.tul.fm.alg1_ukol.simon;
import scanner

/**
 *
 * @author marts
 */
public class FarmFromArgv {
    public static void  main(String[] args) {
        System.out.println("Zadej kolik je na farmě králíků: ");
        int kralici;//dodelat scanner
        System.out.println("Zadej kolik je na farmě hus: ");
        int husy; //dodelat scanner
        int nohy = kralici*4+husy*2;
        int zvirata = husy+kralici;
        System.out.println("Na farmě se nachází "+zvirata+" a mají dohromady "+nohy+" nohou :)");
        
                
        
    
    
    }
    
}
