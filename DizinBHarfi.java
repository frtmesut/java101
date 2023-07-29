public class DizinBHArfi {
    public static void main(String[] args) {
        // Matrisin boyutları
        int rows = 9;
        int cols = 6;

        // Boşluklu hücrelerin koordinatları
        int[][] emptyCells = {
                {1, 1}, {1, 2}, {1, 3}, {1, 4},
                {2, 1}, {2, 2}, {2, 3}, {2, 4},
                {3, 1}, {3, 2}, {3, 3}, {3, 4},
                {5, 1}, {5, 2}, {5, 3}, {5, 4},
                {6, 1}, {6, 2}, {6, 3}, {6, 4},
                {7, 1}, {7, 2}, {7, 3}, {7, 4},
                {0, 5}, {4, 5}, {8, 5}
        };

        // Matrisi oluşturma ve yazdırma
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean isEmptyCell = false;

                // Boşluklu hücrelerin kontrolü
                for (int[] emptyCell : emptyCells) {
                    if (emptyCell[0] == i && emptyCell[1] == j) {
                        isEmptyCell = true;
                        break;
                    }
                }

                if (isEmptyCell) {
                    System.out.print("   "); // 3 boşluk karakteri
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println(); // Bir sonraki satıra geçmek için
        }
    }
}
