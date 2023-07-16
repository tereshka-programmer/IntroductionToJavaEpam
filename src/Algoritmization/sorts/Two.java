package Algoritmization.sorts;

public class Two {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6};

        int n = a.length;
        int m = b.length;
        int[] result = new int[n + m];

        int i = 0; // Индекс для последовательности a
        int j = 0; // Индекс для последовательности b
        int k = 0; // Индекс для результирующей последовательности

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        // Добавляем оставшиеся элементы из a (если остались)
        while (i < n) {
            result[k] = a[i];
            i++;
            k++;
        }

        // Добавляем оставшиеся элементы из b (если остались)
        while (j < m) {
            result[k] = b[j];
            j++;
            k++;
        }

        // Выводим результирующую последовательность
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
