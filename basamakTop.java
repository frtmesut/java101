import java.util.Scanner;

public class basamakTop {
    public static void main(String[] args){

        Scanner veri = new Scanner(System.in);

        int gir, total = 0, basValue;
        System.out.print("(Girdiğiniz sayının basamakları toplanacaktır.)\nBir sayı giriniz : ");
        gir = veri.nextInt();

        while (gir != 0){
            basValue = gir % 10;
            gir /= 10;
            total += basValue;
        }
        System.out.println(total);
    }
}
