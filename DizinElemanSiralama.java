import java.util.Scanner;
import java.util.Arrays;
public class DizinElemanSiralama {
    public static void main(String[] args) {

        Scanner veri = new  Scanner (System.in);
        System.out.print("Dizinin elemanlarını girin: ");
        int n = veri.nextInt();

        int[] num = new int[n];


        for (int i = 0; i < n; i++){
            System.out.print((i+1) + ". Eleman: ");
            num[i] = veri.nextInt();
        }
        Arrays.sort(num);
        System.out.println("Sıralama: " + Arrays.toString(num));
    }
}
