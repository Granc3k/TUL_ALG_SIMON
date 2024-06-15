import java.util.Scanner;
public class Game {
    public static int min = 0, max = 100;
    public static boolean isEnd = false;
    public static void main(String[] args) {
        Menu();
        while(!isEnd){
            System.out.print("Volba: ");
            int choice = Scan();
            switch (choice){
                case 1: User();if(!isEnd){Menu(); break;}else break;
                case 2: Menu();break;
                case 3: Change();Menu();break;
                case 0: System.out.println();isEnd = true;
                default: System.out.println("Spatne zadana volba");
            }
        }
    }
    private static void User(){
        boolean found = false;
        int count = 0, generatedNumber = Number.generateNumber(min, max);
        System.out.print("Zadej cislo: ");
        do{
            count++;
            int number = Scan();
            if (number < min || number > max){
                System.out.print("Cislo "+number+" je mimo rozsah <"+min+";"+max+">");
            }
            else{
                if (number == generatedNumber){
                    found = true;
                    System.out.println("Spravne !!!! cislo "+generatedNumber+" uhadnuto na "+count+" pokus.");
                }
                else if (number < generatedNumber){
                    System.out.print(number+" je mensi nez hledane cislo. Zadej cislo: ");
                }
                else if (number > generatedNumber){
                    System.out.print(number+" je vetsi nez hledane cislo. Zadej cislo: ");
                }
            }
        }while(!found);
        Countinue();
    }
    private static void Countinue(){
        System.out.print("Chcete pokracovat? Y/N: ");
        String rozhodnuti = ScanChar();
        isEnd = !"Y".equals(rozhodnuti);
        isEnd = !"y".equals(rozhodnuti);
    }
    private static void Change(){
        System.out.print("Nastavte nove minimum: ");
        min = Scan();
        System.out.print("Nastavte nove maximum: ");
        max = Scan();
        while(min>max){
            System.out.println("Maximum musi byt vetsi nez minimum !!!");
            System.out.print("Nastavte nove maximum: ");
            max = Scan();
        }
    }
    private static void Menu(){
        DrawALine();
        System.out.println("|            H A D A N I   C I S L A             |");
        System.out.println("|                                                |");
        System.out.println("|   1 = Uzivatel hada        3 = Zmenit rozsah   |");
        System.out.println("|   2 = Pocitac hada         0 = Konec           |");
        DrawALine();       
    }
    private static void DrawALine(){
        int velikost_radku = 50;
        for (int i = 1; i <= velikost_radku; i++){
            if (i < velikost_radku) System.out.print("-");
            else System.out.println("-");
        }
    }
    private static int Scan(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }
    private static String ScanChar(){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        return input;
    }
    private static void Clear(){
        for (int i=0; i<100; i++){
            System.out.println();
        }
    }
}
    