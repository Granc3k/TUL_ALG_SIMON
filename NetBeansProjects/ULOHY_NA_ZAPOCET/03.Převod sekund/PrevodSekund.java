import java.util.Scanner;

public class PrevodSekund {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sekundy = sc.nextInt();
        int h, m, s;
        h = sekundy / 3600;
        m = (sekundy - h * 3600) / 60;
        s = sekundy - h * 3600 - m * 60;
        System.out.printf("%02d:%02d:%02d", h, m, s);
    }

}