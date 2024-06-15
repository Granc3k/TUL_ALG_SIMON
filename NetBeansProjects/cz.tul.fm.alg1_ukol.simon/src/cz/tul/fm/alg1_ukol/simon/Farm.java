/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.tul.fm.alg1_ukol.simon;

/**
 *
 * @author marts
 */
public class Farm {
        public static void main(String[] args) {
            int pocetHus = 69;
            int pocetKraliku = 420;
            int pocetZvirat;
            int pocetNohou;
            pocetZvirat = pocetHus+pocetKraliku;
            pocetNohou = pocetHus*2+pocetKraliku*4;
            System.out.println("Pocet hus: "+pocetHus);
            System.out.println("Pocet králíků: "+pocetKraliku);
            System.out.println("Na farmě je "+pocetZvirat+" zvířat a mají "+pocetNohou+" nohou");
            
}
}
