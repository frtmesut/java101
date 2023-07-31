import java.util.Arrays;
public class MatisTanspose {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 5, 3},
                {4, 8, 6},
                {7, 3, 9},
                {1, 3, 5}
        };

        System.out.println("Matris :");
        printMatris(matris);

        System.out.println("Transpozunu :");
        int[][] transpose = transposeMatris(matris);
        printMatris(transpose);
    }

    public static int[][] transposeMatris(int[][] matris) {
        int rows = matris.length;
        int columns = matris[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matris[i][j];
            }
        }

        return transpose;
    }

    public static void printMatris(int[][] matris) {
        for (int[] row : matris) {
            System.out.println(Arrays.toString(row));
        }
    }
}
