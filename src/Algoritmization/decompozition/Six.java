package Algoritmization.decompozition;

public class Six {

    public static void main(String[] args) {
        int a = 14;
        int b = 21;
        int c = 25;

        boolean coprime = areCoprime(a, b, c);
        if (coprime) {
            System.out.println("Числа являются взаимно простыми");
        } else {
            System.out.println("Числа не являются взаимно простыми");
        }
    }

    public static boolean areCoprime(int a, int b, int c) {
        // Проверяем, есть ли общий делитель, отличный от 1
        for (int i = 2; i <= Math.min(a, Math.min(b, c)); i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                return false; // Обнаружен общий делитель
            }
        }

        return true; // Общего делителя нет
    }

}
