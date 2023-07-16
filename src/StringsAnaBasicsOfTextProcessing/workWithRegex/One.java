package StringsAnaBasicsOfTextProcessing.workWithRegex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TextAnalyzer {
    public static void main(String[] args) {
        String text = "Это первый абзац. Он содержит два предложения.\n" +
                "Это второй абзац. Он содержит одно предложение.\n" +
                "Это третий абзац. Он содержит три предложения.";

        System.out.println("Исходный текст:\n" + text);

        // Операция 1: Сортировка абзацев по количеству предложений
        System.out.println("\nСортировка абзацев по количеству предложений:");
        List<String> paragraphs = getParagraphs(text);
        sortParagraphsBySentenceCount(paragraphs);
        for (String paragraph : paragraphs) {
            System.out.println(paragraph);
        }

        // Операция 2: Сортировка слов в предложениях по длине
        System.out.println("\nСортировка слов в предложениях по длине:");
        List<String> sentences = getSentences(text);
        sortWordsByLength(sentences);
        for (String sentence : sentences) {
            System.out.println(sentence);
        }

        // Операция 3: Сортировка лексем в предложениях по убыванию количества вхождений символа
        System.out.println("\nСортировка лексем в предложениях по убыванию количества вхождений символа:");
        char symbol = 'о';
        sortLexemesBySymbolCount(sentences, symbol);
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }

    // Разделение текста на абзацы
    public static List<String> getParagraphs(String text) {
        String[] paragraphsArray = text.split("\n");
        List<String> paragraphsList = new ArrayList<>();
        Collections.addAll(paragraphsList, paragraphsArray);
        return paragraphsList;
    }

    // Сортировка абзацев по количеству предложений
    public static void sortParagraphsBySentenceCount(List<String> paragraphs) {
        Collections.sort(paragraphs, Comparator.comparingInt(TextAnalyzer::getSentenceCount));
    }

    // Получение количества предложений в абзаце
    public static int getSentenceCount(String paragraph) {
        String[] sentences = paragraph.split("\\.|\\?|!");
        return sentences.length;
    }

    // Разделение предложения на слова
    public static List<String> getWords(String sentence) {
        String[] wordsArray = sentence.split("\\s+");
        List<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, wordsArray);
        return wordsList;
    }

    // Сортировка слов в предложениях по длине
    public static void sortWordsByLength(List<String> sentences) {
        for (String sentence : sentences) {
            List<String> words = getWords(sentence);
            Collections.sort(words, Comparator.comparingInt(String::length));
            StringBuilder sortedSentence = new StringBuilder();
            for (String word : words) {
                sortedSentence.append(word).append(" ");
            }
            sentences.set(sentences.indexOf(sentence), sortedSentence.toString().trim());
        }
    }

    // Сортировка лексем в предложениях по убыванию количества вхождений символа
    public static void sortLexemesBySymbolCount(List<String> sentences, char symbol) {
        for (String sentence : sentences) {
            List<String> lexemes = getWords(sentence);
            Collections.sort(lexemes, (a, b) -> {
                int countA = countSymbolOccurrences(a, symbol);
                int countB = countSymbolOccurrences(b, symbol);
                if (countA != countB) {
                    return countB - countA;
                } else {
                    return a.compareToIgnoreCase(b);
                }
            });
            StringBuilder sortedSentence = new StringBuilder();
            for (String lexeme : lexemes) {
                sortedSentence.append(lexeme).append(" ");
            }
            sentences.set(sentences.indexOf(sentence), sortedSentence.toString().trim());
        }
    }

    // Подсчет количества вхождений символа в строку
    public static int countSymbolOccurrences(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    // Разделение текста на предложения
    public static List<String> getSentences(String text) {
        String[] sentencesArray = text.split("\\.|\\?|!");
        List<String> sentencesList = new ArrayList<>();
        Collections.addAll(sentencesList, sentencesArray);
        return sentencesList;
    }
}
