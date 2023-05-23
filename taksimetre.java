import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);

        Double inBin, km, acilis, kmBas, tplm;

        System.out.print("KM giriniz :");

        km = veri.nextDouble();
        kmBas = 2.20;
        inBin = 20.0;
        acilis = 10.0;

        tplm = (km * kmBas) <= inBin ? inBin : acilis + (km * kmBas);

        System.out.println("Ücretiniz :" + tplm + "TL");

    }

}
