package Algoritmization.matrix;

public class Fifteen {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // Пример матрицы

        int maxElement = Integer.MIN_VALUE; // Начальное значение наибольшего элемента

        // Поиск наибольшего элемента в матрице
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > maxElement) {
                    maxElement = element;
                }
            }
        }

        System.out.println("Наибольший элемент в матрице: " + maxElement);

        // Замена нечетных элементов на наибольший элемент
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = maxElement;
                }
            }
        }

        System.out.println("Матрица после замены нечетных элементов:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
