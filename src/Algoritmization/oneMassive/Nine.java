package Algoritmization.oneMassive;

import java.util.HashMap;
import java.util.Map;

public class Nine {

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 2, 4, 3, 5, 5, 2}; // Пример массива целых чисел
        int n = array.length; // Количество элементов в массиве

        int mostFrequentNumber = findMostFrequentNumber(array, n);

        System.out.println("Наиболее часто встречающееся число: " + mostFrequentNumber);
    }

    public static int findMostFrequentNumber(int[] array, int n) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Считаем частоту встречаемости каждого числа в массиве
        for (int i = 0; i < n; i++) {
            int number = array[i];
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        int mostFrequentNumber = Integer.MAX_VALUE;
        int maxFrequency = 0;

        // Находим наиболее часто встречающееся число
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency || (frequency == maxFrequency && number < mostFrequentNumber)) {
                mostFrequentNumber = number;
                maxFrequency = frequency;
            }
        }

        return mostFrequentNumber;
    }

}
