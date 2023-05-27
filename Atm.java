import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);
        String userName, password;

        int hak = 3;
        int bakiye = 1500;
        int secim = 3;

        while (hak > 0) {
            System.out.print("Kullanıcı adınız : ");
            userName = veri.nextLine();
            System.out.print("Parolanız : ");
            password = veri.nextLine();

            switch (userName) {
                case "mesutfrt" :
                    switch (password) {
                        case "patika123" :
                            System.out.println("Merhaba Fırat Bank'a Hoş Geldiniz");
                            do {
                                System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                                System.out.println("Lütfen yapmal istediğiniz işlemi seçiniz : ");
                                secim = veri.nextInt();

                                switch (secim) {
                                    case 1:
                                        System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                                        int tutar = veri.nextInt();
                                        bakiye += tutar;
                                        break;
                                    case 2:
                                        System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                                        tutar = veri.nextInt();
                                        switch (Integer.compare(tutar, bakiye)) {
                                            case 1:
                                                System.out.println("Bakiyeniz yetersiz.");
                                                break;
                                            default:
                                                bakiye -= tutar;
                                                break;
                                        }break;
                                    case 3:
                                        System.out.println("Bakiyeniz : " + bakiye);
                                        break;
                                }
                            } while (secim != 4);
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                    }
                    break;
                default:
                    hak--;
                    System.out.println("Hatalı kullanıcı adı veya parola. Tekrar deneyiniz.");
                    switch (hak) {
                        case 0:
                            System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                            break;
                        default:
                            System.out.println("Kalan hakkınız : " + hak);
                            break;
                    }
            }
        }
    }
}


