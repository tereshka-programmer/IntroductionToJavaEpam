package Algoritmization.decompozition;

public class Five {

    public static void main(String[] args) {
        int[] array = {5, 2, 7, 1, 3};
        int secondLargest = findSecondLargest(array);
        System.out.println("Второе по величине число: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                // Обновляем значения наибольшего и второго наибольшего чисел
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Обновляем значение второго наибольшего числа
                secondLargest = num;
            }
        }

        return secondLargest;
    }

}
