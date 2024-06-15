import java.util.Scanner;
import java.util.Locale;

public class PrumernaDenniTeplota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float prumernaTeplota;
        float temp_6 = sc.nextFloat();
        float temp_12 = sc.nextFloat();
        float temp_18 = sc.nextFloat();

        prumernaTeplota = (temp_6 + temp_12 + temp_18 * 2) / 4;

        System.out.format(Locale.US, "%1.2f", prumernaTeplota);
    }
}
