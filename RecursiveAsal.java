import java.util.Scanner;

public class RecursiveAsal {

    static boolean isAsal(int sayi) {
        if (sayi < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi)) {
            System.out.println(sayi + " asaldır.");
        } else {
            System.out.println(sayi + " asal değildir.");
        }
    }

}
