import java.util.Scanner;

public class DeseneGoreMetod {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = inp.nextInt();
        System.out.print("Çıktısı: ");
        recursiveMethod(n);
    }
    public static void recursiveMethod(int n) {
        System.out.print(n + " "); // Sayıyı ekrana yazdır
        if (n <= 0) {
            return; // Sayı negatif veya 0 olduğunda metottan çık
        }
        recursiveMethod(n - 5); // Girilen sayıdan 5 rakamını çıkararak metodu tekrar çağır
        System.out.print(n + " "); // Her adımda sayının son değerini ekrana yazdır
    }
}
