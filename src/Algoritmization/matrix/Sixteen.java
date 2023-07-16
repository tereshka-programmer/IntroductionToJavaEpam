package Algoritmization.matrix;

public class Sixteen {

    public static void main(String[] args) {
        int n = 3; // Порядок магического квадрата

        int[][] magicSquare = new int[n][n]; // Создание магического квадрата

        int row = n - 1; // Индекс текущей строки
        int col = n / 2; // Индекс текущего столбца

        for (int num = 1; num <= n * n; num++) {
            magicSquare[row][col] = num;

            row++;
            col++;

            if (row == n && col == n) {
                row = 0;
                col = 0;
            } else if (row == n) {
                row = 0;
            } else if (col == n) {
                col = 0;
            } else if (magicSquare[row][col] != 0) {
                row--;
                col--;
            }
        }

        // Вывод магического квадрата на экран
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }

}
