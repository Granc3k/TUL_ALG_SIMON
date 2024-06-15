package cz.fm.tul.alg01_week05;
import java.util.Scanner;
        
public class uloha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum=0;
        int i=0;
        double average;
        System.out.println("Zadejte kladná čísla, zadávání ukončí 0 nebo zaporna čísla: ");
        number = sc.nextInt();
        while(number>0){
            number = sc.nextInt();
            sum+=number;
            i+=1;   
        }
        if(i>0){
            average=(double)sum/i;
        }
        else {
            average=0;
        }
        System.out.println("Pocet: "+i);
        System.out.println("Suma: "+sum);
    }
}
