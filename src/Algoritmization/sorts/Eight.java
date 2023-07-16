package Algoritmization.sorts;

import java.util.ArrayList;
import java.util.List;

public class Eight {

    public static void main(String[] args) {
        int[] numerators = {3, 5, 1, 2};
        int[] denominators = {2, 3, 4, 5};

        List<Fraction> fractions = new ArrayList<>();
        for (int i = 0; i < numerators.length; i++) {
            Fraction fraction = new Fraction(numerators[i], denominators[i]);
            fractions.add(fraction);
        }

        List<Fraction> sortedFractions = sortFractions(fractions);
        System.out.println("Упорядоченные дроби:");
        for (Fraction fraction : sortedFractions) {
            System.out.println(fraction.getNumerator() + "/" + fraction.getDenominator());
        }
    }

    public static List<Fraction> sortFractions(List<Fraction> fractions) {
        // Приводим дроби к общему знаменателю
        int commonDenominator = getCommonDenominator(fractions);
        for (Fraction fraction : fractions) {
            int newNumerator = fraction.getNumerator() * (commonDenominator / fraction.getDenominator());
            fraction.setNumerator(newNumerator);
            fraction.setDenominator(commonDenominator);
        }

        // Сортируем дроби в порядке возрастания
        fractions.sort(null);

        return fractions;
    }

    public static int getCommonDenominator(List<Fraction> fractions) {
        int commonDenominator = 1;
        for (Fraction fraction : fractions) {
            commonDenominator *= fraction.getDenominator();
        }
        return commonDenominator;
    }

    static class Fraction implements Comparable<Fraction> {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public int getNumerator() {
            return numerator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        @Override
        public int compareTo(Fraction other) {
            int thisValue = this.numerator * other.denominator;
            int otherValue = other.numerator * this.denominator;
            return Integer.compare(thisValue, otherValue);
        }
    }

}
