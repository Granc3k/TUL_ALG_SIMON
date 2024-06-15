package cz.fm.tul.alg01_week05;

import java.util.Scanner;

public class uloha_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0; // delitel a zaroven delitel
        boolean jeDokonaly = false;
        // operace přes modulusy
        // když modulusy == 0 je to cajk, jinak ne a přeruší se to
        System.out.println("Zadejte libovolné kladné číslo: ");
        int number = sc.nextInt();
        String output_cisel = "";
        int cisloOvereni = 0;// scitani delitelu
        // var
        while (cisloOvereni != number && i != number) {
            i += 1;
            if (number % i == 0) {
                output_cisel = output_cisel + i + ", ";
                cisloOvereni += i;
            }

        }
        jeDokonaly = cisloOvereni == number;
        if (jeDokonaly) {
            System.out.println("Zadané číslo: " + number + " je dokonalé a jeho "
                    + "dělitelé jsou: " + output_cisel);
        }
        else {
            System.out.println("Zadané číslo: " + number + " není dokonalé Sadge");
        }
    }
}
