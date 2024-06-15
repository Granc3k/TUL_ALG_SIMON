import java.util.Scanner;
public class Calc {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zadej vyraz, ukonci = ");
        double a = scan.nextDouble(), b;
        char operation;
        boolean isValid = true;
        
        while((isValid && (operation = scan.next().charAt(0)) != '=')){
            b = scan.nextDouble();
            a = calculate(a,b,operation);
            
            Double aa = a;
            if (aa.isInfinite() || aa.isNaN()){
                System.out.println("Neplatny vyraz");
                isValid = false;
            }
        }
        if (isValid) System.out.println(a);
    }
    /**
     * 
     * @param a first operation
     * @param b second operation
     * @param operation operation
     * @return NaN when invalid operation
     */
    public static double calculate (double a, double b, char operation){
        switch(operation){
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            case '/': return a/b; 
            default: return Double.NaN;
        }
    }
}
