package BasicsOfSoftwareDevelopment.Whiles;

import java.math.BigInteger;

public class Four {

    public static void main(String[] args) {
        int n = 200; // Количество чисел
        BigInteger product = BigInteger.ONE; // Переменная для хранения произведения квадратов

        for (int i = 1; i <= n; i++) {
            BigInteger square = BigInteger.valueOf(i).pow(2); // Возведение числа в квадрат
            product = product.multiply(square); // Умножение произведения на текущий квадрат
        }

        System.out.println("Произведение квадратов первых " + n + " чисел: " + product);
    }

}
