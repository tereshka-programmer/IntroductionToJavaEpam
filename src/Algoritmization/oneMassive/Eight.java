package Algoritmization.oneMassive;

import java.util.ArrayList;
import java.util.List;

public class Eight {

    public static void main(String[] args) {
        int[] sequence = {3, 1, 4, 2, 1, 5}; // Пример исходной последовательности a1, a2, ..., an
        int n = sequence.length; // Размерность последовательности

        int min = findMinValue(sequence);

        List<Integer> newSequence = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (sequence[i] != min) {
                newSequence.add(sequence[i]);
            }
        }

        System.out.println("Новая последовательность:");
        for (int num : newSequence) {
            System.out.print(num + " ");
        }
    }

    public static int findMinValue(int[] sequence) {
        int min = Integer.MAX_VALUE;

        for (int num : sequence) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

}
