import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int n = veri.nextInt();

        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Serisi: " + first + " " + second);

        for (int i = 1; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);

            first = second;
            second = next;
        }
        System.out.println();
    }
}
