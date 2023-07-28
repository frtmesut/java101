import java.util.Arrays;
import java.util.Scanner;

public class DiziMinMax {
    public static void main(String[] args) {

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner veri = new Scanner(System.in);

        System.out.print("Dizin için yeni bir değer giriniz: ");
        int n = veri.nextInt();

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = n;

        Arrays.sort(newArr);

        int indexMin = Arrays.binarySearch(newArr, n);
        int indexMax = indexMin + 1;

        int min = newArr[indexMin - 1];
        int max = newArr[indexMax];

        System.out.println("Yeni dizin: " + Arrays.toString(newArr));
        System.out.println("Girdiğiniz değere en yakın min değer: " + min);
        System.out.println("Girdiğiniz değere en yakın max değer: " + max);
    }
}
