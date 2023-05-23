import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double m, kg, kitl;

        Scanner veri = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz :");
        m = veri.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :");
        kg = veri.nextDouble();

        kitl = kg / (m * m);

        System.out.println("Vücut Kitle İndeksiniz :" + kitl);
    }
}
