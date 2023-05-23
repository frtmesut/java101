import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {

        int km, yas, yolTip;
        Scanner veri = new Scanner(System.in);
        Double ucrKm = 0.10, cocuk = 0.5, genc = 0.90, ihtiyar = 0.70, gidDon = 0.80;


        System.out.print("Lütfen gidilecek mesafeyi KM cinsinden giriniz : ");
        km = veri.nextInt();
        System.out.print("Lütfen yolcunun yaşını giriniz : ");
        yas = veri.nextInt();
        System.out.print("1 - Tek yön.\n2 - Gidiş-Dönüş\nLütfen yolculuk tipini seçiniz : ");
        yolTip = veri.nextInt();

        if (yas < 12) {
            if (yolTip == 1) {
                System.out.println("Normal tutar : " + (km*ucrKm) + " TL");
                System.out.println("İndirimli tutar : " + (km * ucrKm * cocuk) + " TL");
            } else if (yolTip == 2) {
                System.out.println("Normal tutar : " + (2 * (km * ucrKm)) + " TL");
                System.out.println("İndirimli tutar : " + (2 * (km * ucrKm * cocuk * gidDon)) + " TL");
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }

        }
        if (yas > 12 && yas < 24) {
            if (yolTip == 1) {
                System.out.println("Normal tutar : " + (km*ucrKm) + " TL");
                System.out.println("İndirimli tutar : " + (km * ucrKm * genc) + " TL");
            } else if (yolTip == 2) {
                System.out.println("Normal tutar : " + (2 * (km * ucrKm)) + " TL");
                System.out.println("İndirimli tutar : " + (2 * (km * ucrKm * genc * gidDon)) + " TL");
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }

        }
        if (yas > 65) {
            if (yolTip == 1) {
                System.out.println("Normal tutar : " + (km*ucrKm) + " TL");
                System.out.println("İndirimli tutar : " + (km * ucrKm * ihtiyar) + " TL");
            } else if (yolTip == 2) {
                System.out.println("Normal tutar : " + (2 * (km * ucrKm)) + "TL");
                System.out.println("İndirimli tutar : " + (2 * (km * ucrKm * ihtiyar * gidDon)) + " TL");
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }

        }
        if (yas <= 65 && yas >= 24) {
            if (yolTip == 1) {
                System.out.println("Bilet tutarı : " + (km*ucrKm) + " TL");
            } else if (yolTip == 2) {
                System.out.println("Normal tutar : " + (2 * (km * ucrKm)) + "TL");
                System.out.println("İndirimli tutar : " + (2 * (km * ucrKm *  gidDon)) + " TL");
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }

        }

    }
}
