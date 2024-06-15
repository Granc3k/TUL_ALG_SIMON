//Designed by Tomáš Moravec
import java.util.Scanner;
public class IF05 {
    public static void main(String[] args) {
        double a, b, c, min, middle, max, help; String text;
        Scanner scan = new Scanner(System.in);
        System.out.print("Zadejte tri cisla + razeni (UP/DOWN): ");
        a = scan.nextDouble(); b = scan.nextDouble(); c = scan.nextDouble(); text = scan.next();
            if (a < b){
                if (c < a){min = c; middle = a; max = b;}
                else if (c > b){min = a; middle = b; max = c;}
                else {min = a; middle = c; max = b;}
            }
            else{
                if (c < b){min = c; middle = b; max = a;}
                else if (c > a){min = b; middle = a; max = c;}
                else {min = b; middle = c; max = a;}
            }
            if ("DOWN".equals(text)){
                help = max;
                max = min;
                min = help;
            }
        System.out.format("Serazena cisla podle pozadavku: \n %f\n %f\n %f\n", max, middle, min);
    }
}