import java.util.Arrays;
public class DizinElemanFrekansi {
    public static void main(String[] args) {
        int[] dizi = {1,1,1,5,5,3,6,7,7,8,8,8,8};
        bulVeYazdir(dizi);
    }

    public static void bulVeYazdir(int[] dizi) {
        // Diziyi küçükten büyüğe sıralayarak tekrar sayılarını daha kolay bulabiliriz.
        Arrays.sort(dizi);

        int eleman = dizi[0];
        int frekans = 1;

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] == eleman) {
                frekans++;
            } else {
                System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
                eleman = dizi[i];
                frekans = 1;
            }
        }

        // Son elemanın frekansını yazdırma işlemi.
        System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
    }
}





