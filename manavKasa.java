import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int arm, elm, dom, mu, pat;
        double armut, elma, domates, muz, patlican, total;
        Scanner veri = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldınız :");
        arm = veri.nextInt();
        System.out.print("Kaç kilo elma aldınız :");
        elm = veri.nextInt();
        System.out.print("Kaç kilo domates aldınız :");
        dom = veri.nextInt();
        System.out.print("Kaç kilo muz aldınız :");
        mu = veri.nextInt();
        System.out.print("Kaç kilo patlıcan aldınız :");
        pat = veri.nextInt();

        armut = arm * 2.14;
        elma = elm * 3.67;
        domates = dom * 1.11;
        muz = mu * 0.95;
        patlican = pat * 5.00;
        total = armut + elma + domates + muz + patlican;

        System.out.println("Toplam Tutar :" + total + "TL");

    }
}
