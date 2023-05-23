import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double r, alf, alan, pi, cevre, dilal;
        Scanner veri = new Scanner(System.in);

        System.out.print("Yarı Çapı Giriniz :");
        r = veri.nextDouble();

        System.out.print("Lütfen Dilim Açısını Giriniz :");
        alf = veri.nextDouble();

        pi = 3.14;
        alan = pi*r*r;
        cevre = 2*pi*r;
        dilal = (pi*r*r*alf)/360;

        System.out.println("Dairenin Çevresi :" + cevre);
        System.out.println("Dairenin Alanı :" + alan);
        System.out.println("Daire diliminin alanı :" + dilal);


    }
}
