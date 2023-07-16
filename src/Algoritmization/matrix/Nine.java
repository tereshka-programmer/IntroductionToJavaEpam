package Algoritmization.matrix;

public class Nine {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // Пример матрицы неотрицательных чисел

        int rows = matrix.length; // Количество строк в матрице
        int columns = matrix[0].length; // Количество столбцов в матрице

        int[] columnSums = new int[columns]; // Массив для хранения сумм элементов в каждом столбце

        // Вычисление сумм элементов в каждом столбце
        for (int j = 0; j < columns; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            columnSums[j] = sum;
        }

        // Поиск столбца с максимальной суммой
        int maxSumColumn = 0;
        for (int j = 1; j < columns; j++) {
            if (columnSums[j] > columnSums[maxSumColumn]) {
                maxSumColumn = j;
            }
        }

        // Вывод результатов
        System.out.println("Суммы элементов в каждом столбце:");
        for (int j = 0; j < columns; j++) {
            System.out.println("Столбец " + j + ": " + columnSums[j]);
        }

        System.out.println("Столбец с максимальной суммой: " + maxSumColumn);
    }

}
