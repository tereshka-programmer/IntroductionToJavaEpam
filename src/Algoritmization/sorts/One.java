package Algoritmization.sorts;

public class One {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int k = 3;

        // Определяем размер результирующего массива
        int mergedLength = array1.length + array2.length;

        // Сдвигаем элементы первого массива вправо, чтобы освободить место для вставки array2
        for (int i = mergedLength - 1; i >= k + array2.length; i--) {
            array1[i] = array1[i - array2.length];
        }

        // Вставляем элементы array2 в освободившееся место
        for (int i = 0; i < array2.length; i++) {
            array1[k + i] = array2[i];
        }

        // Выводим результирующий массив
        for (int i = 0; i < mergedLength; i++) {
            System.out.print(array1[i] + " ");
        }
    }

}
