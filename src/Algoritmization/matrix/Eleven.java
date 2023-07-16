package Algoritmization.matrix;

import java.util.Random;

public class Eleven {

    public static void main(String[] args) {
        int[][] matrix = new int[10][20]; // Создание матрицы 10x20
        Random random = new Random();

        // Заполнение матрицы случайными числами от 0 до 15
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = random.nextInt(16);
            }
        }

        // Вывод матрицы на экран
        System.out.println("Матрица 10x20:");
        printMatrix(matrix);

        // Поиск номеров строк, в которых число 5 встречается три и более раз
        System.out.println("Номера строк, в которых число 5 встречается три и более раз:");
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println(i);
            }
        }
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
