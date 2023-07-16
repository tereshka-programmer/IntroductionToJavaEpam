package BasicsOfSoftwareDevelopment.Whiles;

public class Five {

    public static void main(String[] args) {
        double e = 0.01; // Заданное число е
        int n = 10; // Количество членов ряда
        double sum = 0.0; // Переменная для хранения суммы

        for (int i = 1; i <= n; i++) {
            double a = 1.0 / Math.pow(i, 3); // Общий член ряда
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }

        System.out.println("Сумма членов ряда, модуль которых >= " + e + ": " + sum);
    }

}
