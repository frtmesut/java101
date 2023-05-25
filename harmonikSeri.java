import java.util.Scanner;

public class harmonikSeri {
    public static void main (String[] args){

        Scanner veri = new Scanner(System.in);
        double gir, total = 0;

        System.out.print("(Girdiğiniz sayının harmonik serisi cevaplanacaktır.)\nBir sayı giriniz : ");
        gir = veri.nextInt();

        for (double i = 1.00; i <= gir; i++){
            total += 1/i;
        }
        System.out.println(total);
    }
}
