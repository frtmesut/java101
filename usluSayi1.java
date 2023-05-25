import java.util.Scanner;

public class usluSayi1 {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);
        long taban, us, total = 1;

        System.out.print("Üslü Sayı için;\nTabanı girniz : ");
        taban = veri.nextInt();
        System.out.print("Üst sayıyı giriniz : ");
        us = veri.nextInt();

        for (long i = 1; i <= us; i++) {
            total *= taban;
        }
        System.out.println("Cevap : " + total);


    }
}
