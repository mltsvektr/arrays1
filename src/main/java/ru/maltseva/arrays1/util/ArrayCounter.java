package ru.maltseva.arrays1.util;

public class ArrayCounter {
    public static void countEvenNumber(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void countOddNumber(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void countPrimeNumber(int[] arr) {
        int counter = 0;
        for (int element : arr) {
            boolean flag = true;
            int n = 2;
            if (element < 0) {
                element = element * (-1);
            }
            if (element == 2) {
                counter++;
                flag = false;
            } else if (element == 1) {
                flag = false;
            }
            while (n < element) {
                if (element % n == 0) {
                    flag = false;
                    break;
                }
                n++;
            }
            if (flag) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void summarizeNumbers(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println(sum);
    }

    public static void deductNumbers(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int difference = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            sum1 = sum1 + arr[i];
        }
        for (int i = 1; i < arr.length; i = i + 2) {
            sum2 = sum2 + arr[i];
        }
        difference = sum1 - sum2;
        System.out.println(difference);
    }

    public static void findZero(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}



