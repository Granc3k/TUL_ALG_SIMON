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
public class TwoVectors {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zadej body vektoru");
        double p1x = sc.nextDouble();
        double p1y = sc.nextDouble();
        double p2x = sc.nextDouble();
        double p2y = sc.nextDouble();
        
        double length = vectorTools.getLenghts(p1x,p1y,p2x,p2y);
    }
}