package Algoritmization.matrix;

import java.util.Random;

public class Thirteen {

    public static void main(String[] args) {
        int m = 5; // Количество строк
        int n = 6; // Количество столбцов

        int[][] matrix = new int[m][n]; // Создание матрицы размером m x n
        Random random = new Random();

        // Заполнение матрицы
        for (int j = 0; j < n; j++) {
            int onesCount = j + 1; // Число единиц в текущем столбце

            // Распределение единиц по столбцу
            for (int i = 0; i < m; i++) {
                if (onesCount > 0) {
                    // Генерация случайной позиции для единицы
                    int position = random.nextInt(m);
                    if (matrix[position][j] == 0) {
                        matrix[position][j] = 1;
                        onesCount--;
                    }
                }
            }
        }

        // Вывод матрицы на экран
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
