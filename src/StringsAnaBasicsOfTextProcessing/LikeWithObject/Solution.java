package StringsAnaBasicsOfTextProcessing.LikeWithObject;

public class Solution {

    public static void main(String[] args) {
        // Задача 1: Наибольшее количество подряд идущих пробелов
        String text1 = "This  is   an  example   text   with    spaces.";
        int maxConsecutiveSpaces = findMaxConsecutiveSpaces(text1);
        System.out.println("Наибольшее количество подряд идущих пробелов: " + maxConsecutiveSpaces);

        // Задача 2: Вставка символа 'b' после каждого символа 'a'
        String text2 = "abracadabra";
        String insertedText = insertBAfterA(text2);
        System.out.println("\nВставка символа 'b' после каждого символа 'a': " + insertedText);

        // Задача 3: Проверка, является ли слово палиндромом
        String word = "level";
        boolean isPalindrome = checkPalindrome(word);
        System.out.println("\nСлово '" + word + "' является палиндромом: " + isPalindrome);

        // Задача 4: Составление слова "торт" из частей слова "информатика"
        String word4 = "информатика";
        String newWord = createCakeFromWord(word4);
        System.out.println("\nСлово 'торт' из слова 'информатика': " + newWord);

        // Задача 5: Подсчет количества букв 'а' в строке
        String text5 = "This is an apple.";
        int countA = countLetterA(text5);
        System.out.println("\nКоличество букв 'а' в строке: " + countA);

        // Задача 6: Повторение каждого символа дважды
        String text6 = "Hello";
        String repeatedText = repeatCharacters(text6);
        System.out.println("\nСтрока с повторенными символами: " + repeatedText);

        // Задача 7: Удаление повторяющихся символов и пробелов
        String text7 = "abc cde def";
        String removedDuplicates = removeDuplicatesAndSpaces(text7);
        System.out.println("\nСтрока без повторяющихся символов и пробелов: " + removedDuplicates);

        // Задача 8: Нахождение самого длинного слова
        String text8 = "This is an example sentence.";
        String longestWord = findLongestWord(text8);
        System.out.println("\nСамое длинное слово: " + longestWord);

        // Задача 9: Подсчет количества строчных и прописных букв
        String text9 = "Hello World";
        int lowercaseCount = countLowercaseLetters(text9);
        int uppercaseCount = countUppercaseLetters(text9);
        System.out.println("\nКоличество строчных букв: " + lowercaseCount);
        System.out.println("Количество прописных букв: " + uppercaseCount);

        // Задача 10: Подсчет количества предложений
        String text10 = "This is sentence 1. And this is sentence 2! What about sentence 3?";
        int sentenceCount = countSentences(text10);
        System.out.println("\nКоличество предложений: " + sentenceCount);
    }

    // Задача 1: Наибольшее количество подряд идущих пробелов
    public static int findMaxConsecutiveSpaces(String text) {
        int maxConsecutiveSpaces = 0;
        int currentConsecutiveSpaces = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                currentConsecutiveSpaces++;
                if (currentConsecutiveSpaces > maxConsecutiveSpaces) {
                    maxConsecutiveSpaces = currentConsecutiveSpaces;
                }
            } else {
                currentConsecutiveSpaces = 0;
            }
        }
        return maxConsecutiveSpaces;
    }

    // Задача 2: Вставка символа 'b' после каждого символа 'a'
    public static String insertBAfterA(String text) {
        return text.replace("a", "ab");
    }

    // Задача 3: Проверка, является ли слово палиндромом
    public static boolean checkPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }

    // Задача 4: Составление слова "торт" из частей слова "информатика"
    public static String createCakeFromWord(String word) {
        char[] cakeLetters = { 'т', 'о', 'р', 'т' };
        StringBuilder newWord = new StringBuilder();
        for (char letter : cakeLetters) {
            if (word.contains(String.valueOf(letter))) {
                newWord.append(letter);
            }
        }
        return newWord.toString();
    }

    // Задача 5: Подсчет количества букв 'а' в строке
    public static int countLetterA(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    // Задача 6: Повторение каждого символа дважды
    public static String repeatCharacters(String text) {
        StringBuilder repeatedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            repeatedText.append(text.charAt(i)).append(text.charAt(i));
        }
        return repeatedText.toString();
    }

    // Задача 7: Удаление повторяющихся символов и пробелов
    public static String removeDuplicatesAndSpaces(String text) {
        String removedSpaces = text.replace(" ", "");
        StringBuilder removedDuplicates = new StringBuilder();
        for (int i = 0; i < removedSpaces.length(); i++) {
            if (removedDuplicates.indexOf(String.valueOf(removedSpaces.charAt(i))) == -1) {
                removedDuplicates.append(removedSpaces.charAt(i));
            }
        }
        return removedDuplicates.toString();
    }

    // Задача 8: Нахождение самого длинного слова
    public static String findLongestWord(String text) {
        String[] words = text.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    // Задача 9: Подсчет количества строчных букв
    public static int countLowercaseLetters(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        return count;
    }

    // Задача 9: Подсчет количества прописных букв
    public static int countUppercaseLetters(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        return count;
    }

    // Задача 10: Подсчет количества предложений
    public static int countSentences(String text) {
        String[] sentences = text.split("[.!?]");
        int sentenceCount = 0;
        for (String sentence : sentences) {
            if (!sentence.trim().isEmpty()) {
                sentenceCount++;
            }
        }
        return sentenceCount;
    }

}
