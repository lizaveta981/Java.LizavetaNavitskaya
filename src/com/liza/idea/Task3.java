package com.liza.idea;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " "); // выводим первоначальный массив
        }
        System.out.println();
        int n = array.length; // n-длина массива

        for (int i = 0; i < n/2; i++) {
            int tmp = array[n - i - 1]; // n-во временную переменную отправляем последний элемент массива
            array[n - i - 1] = array[i]; // а последний элемент массива получает значение первого
            array[i] = tmp; // а в первый элемент передаем значение из временной

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
