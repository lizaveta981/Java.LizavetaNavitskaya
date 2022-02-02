package com.liza.idea;

public class Task2 {
    public static void main(String[] args) {
        int[] array2 = new int[20];
        int n = 7;
        int sum1 = 0; // объявили все переменные

        for (int i = 0; i < array2.length; i++) {
            if (i < 2) {
                array2[i] = 1;
            } else {
                array2[i] = array2[i - 2] + array2[i - 1]; // заполнили массив последовательностью
                if (i == n) {
                    break; // если n равно индексу, прерывает
                }
                if (array2[i] % 2 == 0) {
                    sum1 = sum1 + array2[i]; // если четные - складываем.

                }

            }

        }
        System.out.print(sum1);
    }
}
