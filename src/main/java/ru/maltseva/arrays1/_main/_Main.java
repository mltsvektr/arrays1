package ru.maltseva.arrays1._main;

import ru.maltseva.arrays1.util.ArrayCounter;

public class _Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        ArrayCounter.countEvenNumber(arr);
        ArrayCounter.countOddNumber(arr);
        ArrayCounter.countPrimeNumber(arr);
        ArrayCounter.summarizeNumbers(arr);
        ArrayCounter.deductNumbers(arr);
        ArrayCounter.findZero(arr);
    }
}
