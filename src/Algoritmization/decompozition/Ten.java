package Algoritmization.decompozition;

import java.util.Arrays;

public class Ten {

    public static void main(String[] args) {
        int number = 12345;
        int[] digits = getDigitsArray(number);
        System.out.println("Массив цифр числа " + number + ": " + Arrays.toString(digits));
    }

    public static int[] getDigitsArray(int number) {
        // Определяем длину массива
        int length = String.valueOf(number).length();

        // Создаем массив для хранения цифр
        int[] digits = new int[length];

        // Заполняем массив цифрами числа
        int index = length - 1;
        while (number > 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }

        return digits;
    }

}
