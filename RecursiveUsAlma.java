import java.util.Scanner;

public class RecursiveUsAlma {

    static int rec(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int taban =scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int us =scan.nextInt();
        int result =1;

        for (int i=1; i<=us;i++){
            result *= taban;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sonuç : " + rec());

    }
}
