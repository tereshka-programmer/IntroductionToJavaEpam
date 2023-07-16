package Algoritmization.sorts;

import java.util.ArrayList;
import java.util.List;

public class Seven {

    public static void main(String[] args) {
        List<Double> a = new ArrayList<>();
        a.add(1.0);
        a.add(3.0);
        a.add(5.0);

        List<Double> b = new ArrayList<>();
        b.add(2.0);
        b.add(4.0);
        b.add(6.0);

        List<Integer> insertIndexes = findInsertIndexes(a, b);
        System.out.println("Места для вставки: " + insertIndexes);
    }

    public static List<Integer> findInsertIndexes(List<Double> a, List<Double> b) {
        List<Integer> insertIndexes = new ArrayList<>();

        int i = 0; // Индекс для последовательности a
        int j = 0; // Индекс для последовательности b

        while (i < a.size() && j < b.size()) {
            if (b.get(j) <= a.get(i)) {
                // Вставляем индекс перед текущим элементом последовательности a
                insertIndexes.add(i);
                j++;
            } else {
                i++;
            }
        }

        // Если в последовательности a остались элементы, добавляем индекс после последнего элемента
        while (i < a.size()) {
            insertIndexes.add(i);
            i++;
        }

        // Если в последовательности b остались элементы, добавляем индексы после последнего элемента последовательности a
        while (j < b.size()) {
            insertIndexes.add(a.size());
            j++;
        }

        return insertIndexes;
    }

}
