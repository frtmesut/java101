import java.util.Scanner;

public class dersOrtalama {
    public static void main (String [] args) {

        int mat, fiz, bio, kim, muz;
        Scanner veri = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz :");
        mat = veri.nextInt();

        System.out.print("Fizik notunuzu giriniz :");
        fiz = veri.nextInt();

        System.out.print("Biyoloji notunuzu giriniz :");
        bio = veri.nextInt();

        System.out.print("Kimya notunuzu giriniz :");
        kim = veri.nextInt();

        System.out.print("Müzik notunuzu giriniz :");
        muz = veri.nextInt();

        double ort = (mat + fiz + bio + kim + muz) / 5;

        if (mat <0){
            System.out.println("Matematik notunuz 0 ile 100 arasında olmak zorunda.");
        } else if (mat > 100){
            System.out.println("Matematik notunuz 0 ile 100 arasında olmak zorunda.");
        } else if (fiz < 0) {
            System.out.println("Fizik notunuz 0 ile 100 arasında olmak zorunda.");
        } else if (fiz > 100) {
            System.out.println("Fizik notunuz 0 ile 100 arasında olmak zorunda.");
        } else if (bio < 0) {
            System.out.println("Fizik notunuz 0 ile 100 arasında olmak zorunda.");
        } else if (bio > 100) {
            System.out.println("Fizik notunuz 0 ile 100 arasında olmak zorunda.");
        } else if (kim < 0) {
            System.out.println("Fizik notunuz 0 ile 100 arasında olmak zorunda.");
        } else if (kim > 100) {
            System.out.println("Fizik notunuz 0 ile 100 arasında olmak zorunda.");
        } else if (muz < 0) {
            System.out.println("Fizik notunuz 0 ile 100 arasında olmak zorunda.");
        } else if (muz > 100) {
            System.out.println("Fizik notunuz 0 ile 100 arasında olmak zorunda.");
        } else if (ort <= 55) {
            System.out.println("Sınıfta kaldınız, seneye görüşmek üzere.");
            System.out.println("Ortalamanız : " + ort);
        } else {
            System.out.println("tebrikler sınıfı geçtiniz.");
            System.out.println("Ortalamanız : " + ort);
        }
    }
}
