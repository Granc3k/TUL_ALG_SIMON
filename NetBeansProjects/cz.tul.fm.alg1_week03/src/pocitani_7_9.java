/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//@author marts
import java.util.Scanner;

public class pocitani_7_9 {
    public static void main(String[] args) {
        //7
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte teplotu naměřenou v 6:00 ve tvaru xx,xx:");
        double temp_6 = sc.nextDouble();
        System.out.println("Zadejte teplotu naměřenou v 12:00 ve tvaru xx,xx:");
        double temp_12 = sc.nextDouble();
        System.out.println("Zadejte teplotu naměřenou v 18:00 ve tvaru xx,xx:");        
        double temp_18 = sc.nextDouble();
        
        double prumer=(temp_6+temp_12+temp_18*2)/4;
        System.out.println("Denní průměrná teplota byla: "+prumer);
        
        //9
        System.out.println("Zadejte maximální povolenou rychlost: ");
        double v_max=sc.nextDouble();
        System.out.println("Zadejte délku úseku (v kilometrech):");
        double s_km=sc.nextDouble();
        System.out.println("Zadejte počet hodin: ");
        int hod=sc.nextInt();
        System.out.println("Zadejte počet minut: ");
        int min=sc.nextInt();
        System.out.println("Zadejte počet sekund: ");
        int sec=sc.nextInt();
        System.out.println("Zadejte počet setin: ");
        int set=sc.nextInt();
        //var
        double t_in=hod+((double)min/60+(double)sec/3600+(double)set/216000); 
        //čas inputem
        double t_max=s_km/v_max;//čas, co by měl ujet s maxkou
        double v_in=s_km/t_in;//rychlost, co jel
        //var na porovnávání
        
        //cal (porovnání rychlostí,časů
        double porovnani_V=v_in-v_max;
        double porovnani_T=t_max-t_in;
        System.out.println("Vozidlo v dané dráze dosáhlo "+v_in+"km/h a mělo "
                + "rozdíl mezi max a jeho průměrnou rychlostí je: "+porovnani_V
                +"km/h a rozdíl časů mělo: "+porovnani_T+"h");
        
        //17
        System.out.println("Zadejte souřadnici X bodu A:");
        double a_x=sc.nextDouble();
        System.out.println("Zadejte souřadnici Y bodu A:");
        double a_y=sc.nextDouble();
        System.out.println("Zadejte souřadnici X bodu B:");
        double b_x=sc.nextDouble();
        System.out.println("Zadejte souřadnici Y bodu B:");
        double b_y=sc.nextDouble();
         System.out.println("Zadejte souřadnici X bodu C:");
        double c_x=sc.nextDouble();
        System.out.println("Zadejte souřadnici Y bodu C:");
        double c_y=sc.nextDouble();
        
        double c=Math.sqrt(Math.pow(a_x-b_x,2)+
                Math.pow(a_y-b_y,2));
        double a=Math.sqrt(Math.pow(b_x-c_x,2)+
                Math.pow(b_y-c_y,2));
        double b=Math.sqrt(Math.pow(a_x-c_x,2)+
                Math.pow(a_y-c_y,2));
        double obvod=a+b+c;
        double s=(a+b+c)/2;
        double obsah=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Trojúhelník ABC má obvod: "+obvod+" a jeho obsah je: "+obsah);
        
        
        
        
    }
}
