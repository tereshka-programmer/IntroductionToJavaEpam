package BasicsOfSoftwareDevelopment.Whiles;

public class Three {

    public static void main(String[] args) {
        int n = 100; // Количество чисел
        int sum = 0; // Переменная для хранения суммы квадратов

        for (int i = 1; i <= n; i++) {
            sum += i * i; // Добавляем квадрат текущего числа к сумме
        }

        System.out.println("Сумма квадратов первых " + n + " чисел: " + sum);
    }

}
