package Algoritmization.matrix;

import java.util.Arrays;

public class Twelfe {

    public static void main(String[] args) {
        int[][] matrix = {
                {4, 2, 6},
                {1, 9, 3},
                {7, 5, 8}
        }; // Пример матрицы

        // Сортировка строк по возрастанию значений элементов
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }

        System.out.println("Матрица после сортировки по возрастанию:");
        printMatrix(matrix);

        // Сортировка строк по убыванию значений элементов
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                matrix[i][matrix[i].length - 1 - j] = temp;
            }
        }

        System.out.println("Матрица после сортировки по убыванию:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
