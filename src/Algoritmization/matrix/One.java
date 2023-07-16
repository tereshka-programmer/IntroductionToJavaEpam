package Algoritmization.matrix;

public class One {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        }; // Пример матрицы

        int rows = matrix.length; // Количество строк в матрице
        int columns = matrix[0].length; // Количество столбцов в матрице

        for (int j = 0; j < columns; j += 2) {
            if (matrix[0][j] > matrix[rows - 1][j]) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
