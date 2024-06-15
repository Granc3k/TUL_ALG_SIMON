package Treti;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        //Inputs declaration
        int lines = 0, column = 0, x = 0, y = 0, position = 0;
        
        //Program input
        Scanner scan = new Scanner(System.in);
        System.out.print("Zadejte velikost tabulky [m,n]: ");
        lines = scan.nextInt(); 
        column = scan.nextInt();
        
        System.out.print("Zadejte pozici v tabulce [x,y] ");
        x = scan.nextInt(); 
        y = scan.nextInt();
        System.out.print("\n");
        
        //Program calculation
        position = (((x - 1) * 3)+2);
                
        //Program output
        System.out.format("Poradni pozice [%d,%d] v tabulce [%d,%d] je: %d\n\n", x, y, lines, column, position);     
    }
}
