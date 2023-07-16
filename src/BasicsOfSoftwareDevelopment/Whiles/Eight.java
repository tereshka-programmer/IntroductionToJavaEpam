package BasicsOfSoftwareDevelopment.Whiles;

public class Eight {

    public static void main(String[] args) {
        int number1 = 123456; // Первое число
        int number2 = 345678; // Второе число

        String digitsInCommon = findCommonDigits(number1, number2);

        System.out.println("Цифры, входящие в запись обоих чисел: " + digitsInCommon);
    }

    public static String findCommonDigits(int number1, int number2) {
        String strNumber1 = String.valueOf(number1);
        String strNumber2 = String.valueOf(number2);

        String digitsInCommon = "";

        for (int i = 0; i < strNumber1.length(); i++) {
            char digit = strNumber1.charAt(i);
            if (strNumber2.contains(String.valueOf(digit)) && !digitsInCommon.contains(String.valueOf(digit))) {
                digitsInCommon += digit;
            }
        }

        return digitsInCommon;
    }

}
