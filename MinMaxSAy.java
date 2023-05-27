import java.util.Scanner;

public class MinMaxSay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = scanner.nextInt();

        int enBuyuk = -2147483648;  
        int enKucuk = 2147483647;   

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
