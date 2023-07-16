package BasicsOfSoftwareDevelopment.linearPrograms;

public class Four {

    public static void main(String[] args) {
        double R = 123.456; // Замените значение на нужное

        int integerPart = (int) R; // Получаем целую часть числа
        double fractionalPart = R - integerPart; // Получаем дробную часть числа

        double result = (fractionalPart * 1000) + integerPart / 1000.0; // Меняем местами и объединяем

        System.out.println("Полученное значение числа: " + result);
    }

}
