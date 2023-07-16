package Algoritmization.matrix;

public class Ten {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, -2, 3},
                {-4, 5, -6},
                {7, -8, 9}
        }; // Пример квадратной матрицы

        int size = matrix.length; // Размер квадратной матрицы

        System.out.println("Положительные элементы главной диагонали:");
        for (int i = 0; i < size; i++) {
            int element = matrix[i][i];
            if (element > 0) {
                System.out.print(element + " ");
            }
        }
    }

}
