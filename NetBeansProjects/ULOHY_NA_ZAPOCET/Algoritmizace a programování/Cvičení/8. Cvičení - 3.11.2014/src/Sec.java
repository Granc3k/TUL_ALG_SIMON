import java.util.Scanner;
import cz.tul.alp.janvit.number.Number;
public class Sec {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int run;
        try{
        do{
            CalcSec();
            System.out.println ("\nPro pokracovani zmackni A ");
            run = scan.next().charAt(0);
        }while (run == 'A' || run == 'a');
        }
        catch(Exception e){
            System.out.println("Chyba");
        }
    }
    public static void CalcSec(){
        System.out.println ("\nZadej posloupnost (pocet + cleny): ");
        int number;
        int number0 = Integer.MIN_VALUE;
        boolean isSorted = true;
        int sum_ofNumbers = 0;
        int sum_ofMax = 1;
        int sum_ofPrime = 0;
        int pocet = scan.nextInt();
        int max = Integer.MIN_VALUE;
        
        for (int i = 1; i <= pocet; i++){
            number = scan.nextInt();
            sum_ofNumbers += number;
            if (number > max){
                max = number;
                sum_ofMax = 1;
            } else if (number == max){
                sum_ofMax++;
            }
            if (Number.isPrime(number)){
                sum_ofPrime++;
            }
            if (number0 > number){
                isSorted = false;
            }
            number0 = number;
        }
        
        System.out.println ("\nPrumer je " + (double)(sum_ofNumbers/pocet));
        System.out.println ("Maximum je " + max);
        System.out.println ("Pocet maxim je " + sum_ofMax);
        System.out.println ("Pocet prvocisel je " + sum_ofPrime);
        System.out.println (((isSorted)? "Je": "Neni")+" setridena od min");
    }
}