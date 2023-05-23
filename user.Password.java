import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        String kull = "patika";
        String sifre = "java101";

        String wrongPassword = "";

        Scanner veri = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        String userName = veri.nextLine();
        System.out.print("Şifreniz: ");
        String password = veri.nextLine();

        if (userName.equals(kull) && password.equals(sifre)) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Hatalı Şifre Girdiniz.");
            wrongPassword = password;

            System.out.println("1 - Şifremi sıfırlamak istiyorum.\n2 - Şifremi sıfırlamak istemiyorum.");
            int wrong = veri.nextInt();
            veri.nextLine(); // Boş satırı oku

            if (wrong == 1) {
                System.out.print("(Yeni şifreniz hatalı girdiğiniz ve geçerli şifre ile aynı olamaz.)\nYeni şifreniz: ");
                String newPassword = veri.nextLine();
                if (newPassword.equals(wrongPassword) || newPassword.equals(sifre)) {
                    System.out.println("Yeni şifreniz hatalı. Lütfen yeni bir şifre giriniz.");
                } else {
                    sifre = newPassword;
                    System.out.println("Şifre başarıyla değiştirildi.");
                }
            }
        }
    }
}
