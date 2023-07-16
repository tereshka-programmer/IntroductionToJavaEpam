package Algoritmization.matrix;

public class Three {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // Пример матрицы

        int k = 1; // Номер строки
        int p = 2; // Номер столбца

        System.out.println("k-я строка:");
        for (int j = 0; j < matrix[k].length; j++) {
            System.out.print(matrix[k][j] + " ");
        }

        System.out.println("\np-й столбец:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][p]);
        }
    }

}
