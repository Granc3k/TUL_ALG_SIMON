//Designed by Tomáš Moravec
import java.util.Scanner;
public class DegreeToRadian {
    public static void main(String[] args) {
        int degree = 0; double rad = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Zadejte pocet stupnu: ");
        degree = scan.nextInt();
        if (degree > 360 || degree < 0) System.out.print("Spatne zadany vstup \n");
        else{
            rad = (double) Math.toRadians(degree);
            System.out.format("%d stupnu = %.3f radianu \n", degree, rad);
        }
    }
}