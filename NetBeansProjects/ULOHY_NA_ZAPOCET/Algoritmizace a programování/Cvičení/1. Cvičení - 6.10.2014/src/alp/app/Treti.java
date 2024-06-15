package alp.app;

import alp.tools.Bod;
public class Treti {
    public static void main (String[] args) {
        System.out.println("Toto je muj treti program v jazyce Java");
        Bod b = new Bod(3, 4);
        System.out.println("Bod se souradnicemi: " + b.getX() + " " +b.getY());
        System.out.println("Konec programu");
    }
}