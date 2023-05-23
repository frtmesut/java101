import java.util.Scanner;

public class saydirmaTopla {
    public static void main(String[] args) {

        int k, total = 0;
        Scanner veri = new Scanner(System.in);
        
        do {
            System.out.print("bir sayı giriniz : ");
            k = veri.nextInt();
            if (k % 4 == 0){
                total += k;
            }
        }while (k % 2 == 0);

        System.out.println(total);

    }
}
