import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);
        int i, n,r, totaln = 1, totalr = 1, totalnr = 1;


        System.out.print("Kümeniz kaç elemanlı : ");
        n = veri.nextInt();
        System.out.print("Kaç elemanlı farklı grup oluştırmak istiyorsunuz : ");
        r = veri.nextInt();

        for (i = 1;i <= n; i++ ){
            totaln *= i;
        }
        for (i = 1;i <= r; i++ ){
            totalr *= i;
        }

        int nrFark = n - r;

        for (i = 1;i <= nrFark; i++ ){
            totalnr *= i;
        }

        System.out.println("C(n,r) : " + (totaln / (totalr * totalnr)));

    }
}
