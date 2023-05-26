import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);
        int n, total, mutlakD;

        System.out.print("Lütfen tek sayı giriniz.\nBir sayı giriniz : ");
        n = veri.nextInt();

        int star;
        int j;

        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                total = (i - (n / 2));
                mutlakD = Math.abs(total);

                for (int k = 0; k < mutlakD; k++) {
                    System.out.print(" ");
                }
                do {
                    j = 0;
                    star = (i < (n / 2) ? 2 * i + 1 : Math.abs(2 * (n - i) - 1));
                    for (int m = 0; m < star; m++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    j++;

                } while (star < j);
            }

        } else {
            System.out.println("lütfen tek sayı giriniz.");
        }


    }
}




