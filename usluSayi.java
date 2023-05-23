import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {

        int k;
        Scanner veri = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz : ");
        k = veri.nextInt();


        System.out.println("4'ün kuvvetleri\n-----------------");
        for (int i = 1; i <= k; i*=4) {
            System.out.println(i);
        }
        System.out.println("\n\n5'ün kuvvetleri\n-----------------");
        for (int n = 1; n <= k; n*=5) {
            System.out.println(n);
        }
    }
}
