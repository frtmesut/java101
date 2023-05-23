import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int number1, number2, select;
    Scanner veri = new Scanner(System.in);
        System.out.print("İlk sayısı giriniz :");
        number1 = veri.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        number2 = veri.nextInt();

        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        System.out.print("Seçiminiz :");
        select = veri.nextInt();

        switch (select){
            case 1:
                System.out.println(number1+number2);
                break;
            case 2:
                System.out.println(number1-number2);
                break;
            case 3:
                System.out.println(number1*number2);
                break;
            case 4:
                if (number2!=0){
                    System.out.println(number1/number2);
                }else {
                    System.out.println("Bir sayı sıfıra  bölünmez. Tekrar deneyiniz.");
                }
                break;
        }
    }
}
