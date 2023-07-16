package Algoritmization.matrix;

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // Пример числовой матрицы

        int rows = matrix.length; // Количество строк в матрице
        int columns = matrix[0].length; // Количество столбцов в матрице

        // Вывод исходной матрицы
        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        // Ввод номеров столбцов от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер первого столбца: ");
        int column1 = scanner.nextInt();
        System.out.print("Введите номер второго столбца: ");
        int column2 = scanner.nextInt();

        // Проверка валидности введенных номеров столбцов
        if (column1 < 0 || column1 >= columns || column2 < 0 || column2 >= columns) {
            System.out.println("Введены некорректные номера столбцов.");
            return;
        }

        // Меняем местами столбцы
        for (int i = 0; i < rows; i++) {
            int temp = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = temp;
        }

        // Вывод измененной матрицы
        System.out.println("Матрица после замены столбцов:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
