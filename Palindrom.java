import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int number) {

        Scanner veri = new Scanner(System.in);
        System.out.print("bir sayı girin: ");
        number = veri.nextInt();

        int temp = number, tersNum = 0, sonSay;
        while (temp !=0) {
            sonSay = temp % 10;
            tersNum = (tersNum * 10) + sonSay;
            temp /= 10;
        }
        if (number == tersNum)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(1));
    }
}
