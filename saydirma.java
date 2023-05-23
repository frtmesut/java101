import java.util.Scanner;

public class saydirma {
    public static void main(String[] args) {

        int k, sayac = 0, toplam = 0;
        double ort;
        Scanner veri = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        k = veri.nextInt();

        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayac++;
            }

        }
        ort = toplam / sayac;

        System.out.println(ort);

    }
}
