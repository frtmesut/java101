import java.util.Arrays;

public class DizinSiraliCift {
    public static void main(String[] args) {
        int[] num = {10, 4, 20, 8, 12, 14, 10, 16, 22, 28, 4, 12, 18, 26, 30, 28, 36, 16, 6, 32};
        System.out.println("Dizi: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sıralı Şekli: " + Arrays.toString(num));

        int counter = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i+1]) {
                int ciftNum = num[i];
                if (ciftNum % 2 == 0) {
                    counter++;
                    System.out.print(ciftNum + " ");
                }

            }
        }

    }
}
