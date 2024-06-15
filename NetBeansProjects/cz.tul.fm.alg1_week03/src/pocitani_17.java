//@author marts
import java.util.Scanner;


public class pocitani_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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
