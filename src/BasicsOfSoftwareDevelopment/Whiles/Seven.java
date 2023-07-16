package BasicsOfSoftwareDevelopment.Whiles;

import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное значение m: ");
        int m = scanner.nextInt();

        System.out.print("Введите конечное значение n: ");
        int n = scanner.nextInt();

        // Проверка на корректность ввода
        if (m <= 0 || n <= 0 || m > n) {
            System.out.println("Ошибка: некорректные значения m и n.");
            return;
        }

        for (int i = m; i <= n; i++) {
            System.out.print("Делители числа " + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

}
