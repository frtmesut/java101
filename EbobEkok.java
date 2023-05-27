import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);
        int n1, n2, kucSayi, ebob =1, i = 1;

        System.out.print("n1 sayısını giriniz : ");
        n1 = veri.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        n2 = veri.nextInt();

        if (n1 < n2){
            kucSayi = n1;
        } else {
            kucSayi = n2;
        }

        while (i <= kucSayi) {
            if (n1 % i == 0 && n2 % i ==0) {
              ebob = i;
            }
            i++;
        }
        System.out.println("EBOB : " + ebob);

        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 ==0) {
                break;
            }
            i++;
        }
        System.out.println("EKOK : " + i);
    }
}
