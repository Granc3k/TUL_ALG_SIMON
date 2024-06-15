 package alp.app;

public class Ctvrty {
    public static void main(String[] args) {
        System.out.println("Toto je muj ctvrty program v jazyce Java");
        System.out.println("Vypisuji vsechny parametry zadane na prikazove radce");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("Konec programu");   
    }
}