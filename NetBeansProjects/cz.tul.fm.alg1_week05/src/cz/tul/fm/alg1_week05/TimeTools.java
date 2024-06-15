/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.tul.fm.alg1_week05;
import java.util.Scanner;
/**
 *
 * @author marts
 */
public class TimeTools {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rok= sc.nextInt();
        int mesic=sc.nextInt();
        int dny = DateTimeTools.daysInMonth(rok, mesic);
        
        System.out.println("Tento měsíc má "+dny+" dní");




    }
}
    

