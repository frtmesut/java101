import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = veri.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= (i-1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2*n) - (2 * i + 1)); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
