package Treti;
import java.util.Scanner;
public class Hodiny {
    public static void main(String[] args) {
        //Inputs declaration
        int seconds = 0, help = 0, hh = 0, mm = 0, ss = 0;
        
        //Program input
        Scanner scan = new Scanner(System.in);
        System.out.print("Zadej počet sekund: ");
        seconds = scan.nextInt(); System.out.print("\n");
        help = seconds;
        
        //Program calculation
        hh = help / 3600; help = seconds%3600;
        mm = help / 60; help = seconds%60;
        ss = help;
                
        //Program output
        System.out.format("%d sekund = %02d:%02d:%02d\n\n", seconds, hh, mm, ss);     
    }
}
