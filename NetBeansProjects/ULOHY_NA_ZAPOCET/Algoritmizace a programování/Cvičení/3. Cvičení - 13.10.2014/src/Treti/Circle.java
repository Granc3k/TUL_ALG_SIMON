package Treti;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        //Inputs declaration
        float r = 0, circuit = 0, content = 0;
        
        //Program input
        Scanner scan = new Scanner(System.in);
        System.out.print("Zadejte polomer: ");
        r = scan.nextFloat();
        
        //Program calculation
        circuit = (float)(2*r*Math.PI);
        content = (float)(Math.PI*Math.pow(r, 2));
                
        //Program output
        System.out.format("Kruh o polomeru %f, ma obvod %f cm a obsah %f cm2 \n\n", r, circuit, content);
    }
}
