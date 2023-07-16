package StringsAnaBasicsOfTextProcessing.workWithStringsLikeWithMassiveOfData;

public class Solution {

    public static void main(String[] args) {
        // Задача 1: Преобразование camelCase в snake_case
        String camelCaseVariable = "myVariableName";
        String snakeCaseVariable = convertCamelCaseToSnakeCase(camelCaseVariable);
        System.out.println("Преобразование camelCase в snake_case:");
        System.out.println(camelCaseVariable + " -> " + snakeCaseVariable);

        // Задача 2: Замена вхождений 'word' на 'letter'
        String inputString = "This is a word. Another word.";
        String replacedString = replaceWordWithLetter(inputString);
        System.out.println("\nЗамена вхождений 'word' на 'letter':");
        System.out.println(inputString + " -> " + replacedString);

        // Задача 3: Подсчет количества цифр в строке
        String stringWithDigits = "abc123def456";
        int digitCount = countDigits(stringWithDigits);
        System.out.println("\nКоличество цифр в строке:");
        System.out.println("Строка: " + stringWithDigits);
        System.out.println("Количество цифр: " + digitCount);

        // Задача 4: Подсчет количества чисел в строке
        String stringWithNumbers = "12 apples, 3 oranges, and 45 bananas";
        int numberCount = countNumbers(stringWithNumbers);
        System.out.println("\nКоличество чисел в строке:");
        System.out.println("Строка: " + stringWithNumbers);
        System.out.println("Количество чисел: " + numberCount);

        // Задача 5: Удаление лишних пробелов в строке
        String stringWithExtraSpaces = "   This  is  an  example   string.   ";
        String trimmedString = removeExtraSpaces(stringWithExtraSpaces);
        System.out.println("\nУдаление лишних пробелов в строке:");
        System.out.println("Исходная строка: '" + stringWithExtraSpaces + "'");
        System.out.println("Результат: '" + trimmedString + "'");
    }

    // Метод для преобразования camelCase в snake_case
    public static String convertCamelCaseToSnakeCase(String camelCase) {
        return camelCase.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
    }

    // Метод для замены вхождений 'word' на 'letter'
    public static String replaceWordWithLetter(String input) {
        return input.replaceAll("word", "letter");
    }

    // Метод для подсчета количества цифр в строке
    public static int countDigits(String input) {
        int digitCount = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    // Метод для подсчета количества чисел в строке
    public static int countNumbers(String input) {
        String[] words = input.split("\\D+");
        int numberCount = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                numberCount++;
            }
        }
        return numberCount;
    }

    // Метод для удаления лишних пробелов в строке
    public static String removeExtraSpaces(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

}
