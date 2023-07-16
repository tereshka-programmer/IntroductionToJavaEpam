package Algoritmization.matrix;

public class Two {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // Пример квадратной матрицы

        int size = matrix.length; // Размер квадратной матрицы

        System.out.println("Элементы на главной диагонали:");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }

}
