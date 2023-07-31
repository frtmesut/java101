import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rast = new Random();
        int num = rast.nextInt(100);

        Scanner veri = new Scanner(System.in);
        int right = 0;
        int secim;
        int[] yanlis = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            secim = veri.nextInt();

            if (secim < 0 || secim > 99) {
                System.out.println("Lütfen 0-100 arası bir sayı giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + (5 - right));

                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (secim == num) {
                System.out.println("Tebrikler doğru tahmin! Tahmin ettiğiniz sayı: " + num);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (secim > num) {
                    System.out.println(secim + " sayısı, gizli sayıdan büyük.");
                } else {
                    System.out.println(secim + " sayısı, gizli sayıdan küçük.");
                }
                yanlis[right++] = secim;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Doğru cevap: " + num);
            if (!isWrong){
                System.out.println("Tahminleriniz: " + Arrays.toString(yanlis));
            }
        }
    }
}
