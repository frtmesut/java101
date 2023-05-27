import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);

        int n, total = 0;

        System.out.print("Bir sayı giriniz : ");
        n = veri.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }
        if (total == n){
            System.out.println(n + " Mükemmel bir sayıdır.");
        } else {
            System.out.println(n + " Mükemmel bir sayı değildir.");
        }
    }
}
