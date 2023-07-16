package BasicsOfSoftwareDevelopment.Whiles;

public class Two {

    public static void main(String[] args) {
        double a = 1.0; // Начальная точка отрезка
        double b = 5.0; // Конечная точка отрезка
        double h = 0.5; // Шаг

        calculateFunctionValues(a, b, h);
    }

    public static void calculateFunctionValues(double a, double b, double h) {
        for (double x = a; x <= b; x += h) {
            double y = yourFunction(x); // Здесь ваша функция, которую нужно вычислить
            System.out.println("Значение функции при x = " + x + ": " + y);
        }
    }

    // Пример функции: квадрат числа
    public static double yourFunction(double x) {
        return x * x;
    }

}
