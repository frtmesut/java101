import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);

        // x: Dik üçgenin yatay kenarı, y: Dik üçgenin dikey kenarı, hip: hipotenüsü tanımlamaktadır.
        Double x, y, hip, alan, cevre;

        System.out.print("Üçgenin yatay kenar uzunluğunu giriniz:");
        y = veri.nextDouble();

        System.out.print("Üçgenin dikey kenar uzunluğunu giriniz:");
        x = veri.nextDouble();

        alan = (x*y)/2;
        hip =  Math.sqrt(x*x+y*y);
        cevre = x+y+hip;

        System.out.println("Üçgenin Hipotenüsü :" + hip);
        System.out.println("Üçgenin Çevresi :" + cevre);
        System.out.println("Üçgenin Alanı :" + alan);



    }
}
