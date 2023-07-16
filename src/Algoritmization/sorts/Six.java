package Algoritmization.sorts;

public class Six {

    public static void main(String[] args) {
        int[] array = {5, 2, 7, 1, 3};
        shellSort(array);

        // Выводим отсортированный массив
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void shellSort(int[] array) {
        int n = array.length;
        int h = 1;

        // Выбираем начальное значение шага сортировки h
        while (h < n / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            // Сортировка вставками для каждого шага h
            for (int i = h; i < n; i++) {
                int key = array[i];
                int j = i;

                while (j >= h && array[j - h] > key) {
                    array[j] = array[j - h];
                    j -= h;
                }

                array[j] = key;
            }

            h = h / 3; // Уменьшаем шаг сортировки h
        }
    }

}
