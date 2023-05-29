public class AsalSay {
    public static void main(String[] args) {

        for (int sayi = 2; sayi <= 100; sayi++) {
            int sayac = 0;

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    sayac++;
                    break;
                }
            }
            if (sayac == 0) {
                System.out.println(sayi);
            }
        }
    }
}
