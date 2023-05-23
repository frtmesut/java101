import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);

        System.out.print("KDV'siz fiyat giriniz:");
        double fiyat = veri.nextDouble();
        double sonuc = fiyat <= 1000.0 ? fiyat * 0.18 + fiyat : fiyat * 0.08 + fiyat;
        System.out.println(sonuc);
        
    }
}
