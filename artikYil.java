import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {

        int yil, girYil, yuzYil, kalan;

        Scanner veri = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil =veri.nextInt();

        yuzYil = yil % 400;
        kalan = yil % 4;

        if (yuzYil == 0) {
            if (kalan == 0) {
                System.out.println(yil + " bir artık yıldır.");
            }
        } else {
            System.out.println(yil +   " bir artık yıl değildir.");
        }


    }
}
