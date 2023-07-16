package Algoritmization.oneMassive;

public class Two {

    public static void main(String[] args) {
        double[] sequence = {2.5, 3.7, 1.9, 4.2, 2.8}; // Пример последовательности а1, а2, ..., ап
        double z = 3.0; // Заданное число Z

        int replacements = replaceElements(sequence, z);

        System.out.println("Количество замен: " + replacements);
        System.out.println("Измененная последовательность:");
        for (double num : sequence) {
            System.out.print(num + " ");
        }
    }

    public static int replaceElements(double[] sequence, double z) {
        int replacements = 0;

        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > z) {
                sequence[i] = z;
                replacements++;
            }
        }

        return replacements;
    }

}
