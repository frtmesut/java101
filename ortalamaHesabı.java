import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);

        double mat, geo, bio, fiz, kim, edeb, tar;

        System.out.print("Matematik notunuzu giriniz:");
        mat = veri.nextDouble();

        System.out.print("Geometri notunuzu giriniz:");
        geo = veri.nextDouble();

        System.out.print("Biyoloji notunuzu giriniz:");
        bio = veri.nextDouble();

        System.out.print("Fizik notunuzu giriniz:");
        fiz = veri.nextDouble();

        System.out.print("Kimya notunuzu giriniz:");
        kim = veri.nextDouble();

        System.out.print("Edebiyat notunuzu giriniz:");
        edeb = veri.nextDouble();

        System.out.print("Tarih notunuzu giriniz:");
        tar = veri.nextDouble();

        double toplam = mat + geo + bio + fiz + kim + edeb + tar;

        String sonuc = (toplam)/7 >= 60 ? "Geçtiniz" : "Kaldınız";


        System.out.println("Ortalamanız:" + toplam / 7);
        System.out.println("Geçme durumu:" + sonuc);
    }
}
