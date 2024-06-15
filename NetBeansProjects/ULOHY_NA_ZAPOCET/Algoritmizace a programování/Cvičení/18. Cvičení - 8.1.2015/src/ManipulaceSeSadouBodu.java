import java.util.Scanner;
//Test: 0 2 -1 0 0 -1 1 -1 1 0
//Obvod = 7.8863
//Obsah = 3.5
public class ManipulaceSeSadouBodu {
    int n = 5;
    //Na konec pole dame prvni hodnotu, ochrana proti preteceni.
    double[] x = new double[n + 1];
    double[] y = new double[n + 1];
    Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        ManipulaceSeSadouBodu p = new ManipulaceSeSadouBodu();
        System.out.println("Zadaj souradnice pro " + p.n + " bodu.");
        p.loadPoints();
        p.printPoints();
        System.out.format("Obvod utvaru je %.4f%n", p.calculatePerimeter());
        System.out.format("Obsah utvaru je %.4f%n", p.calculateArea());
        p.sortByDistance();
        p.printPoints();
    }

    private void loadPoints() {
        for(int i = 0; i < n; i++){
            x[i] = scan.nextDouble();
            y[i] = scan.nextDouble();
        }
        x[n] = x[0];
        y[n] = y[0];
    }

    private void printPoints() {
        for(int i = 0; i < n; i++){
            System.out.println("[" + x[i] + ", " + y[i] + "]");
        }
    }

    private double calculatePerimeter() {
        double perim = 0;
        for(int i = 0; i < n; i++){
            perim = perim + calculateDistance(x[i], y[i], x[i+1], y[i+1]);
        }
        
        return perim;
    }

    private static double calculateDistance(double xA, double yA, double xB, double yB) {
           return Math.sqrt(Math.pow(xA - xB, 2) + Math.pow(yA - yB, 2));
    }

    private double calculateArea() {
        double area = 0;
        for(int i = 0; i < n; i++){
            area = area + (x[i] * y[i+1] - x[i+1] * y[i]);
        }
        area = 0.5*Math.abs(area);
        return area;
    }

    private void sortByDistance() {
        for (int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if (calculateDistance(x[j+1], y[j+1], 0, 0) < calculateDistance(x[j], y[j], 0 , 0)){
                    double pomx = x[j];
                    double pomy = y[j];
                    x[j] = x[j+1];
                    y[j] = y[j+1];
                    x[j+1] = pomx;
                    y[j+1] = pomy;
                
                }
            }
        }
    }
}