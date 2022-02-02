package com.liza.idea;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        int n = 1; //объявили все переменные

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]; //считаем сумму всех элементов..

            if (array[i] == n) {
                sum = sum - n;
            }  //если элемент равен n, вычитаем

            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print(sum);
    }
}

