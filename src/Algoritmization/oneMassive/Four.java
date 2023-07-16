package Algoritmization.oneMassive;

public class Four {

    public static void main(String[] args) {
        double[] array = {3.7, 1.2, 4.5, 2.8, 0.9}; // Пример массива
        int n = array.length; // Размерность массива

        // Ищем индекс наибольшего элемента
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        // Ищем индекс наименьшего элемента
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        // Меняем местами наибольший и наименьший элементы
        double temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;

        // Выводим измененный массив
        System.out.println("Измененный массив:");
        for (double num : array) {
            System.out.print(num + " ");
        }
    }

}
