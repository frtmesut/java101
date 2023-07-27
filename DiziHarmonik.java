public class DiziHarmonik {
    public static void main(String[] args) {
        double[] num = {1, 2, 3};
        double sum = 0.0;

        for (double i: num){
            sum += 1/i;
        }
        System.out.println(sum);
    }
}
