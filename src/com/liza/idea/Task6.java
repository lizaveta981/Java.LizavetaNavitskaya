package com.liza.idea;

public class Task6 {
    public static void main(String[] args) {
        int[][] Array1 = {{1, 0, 3}, {7, 5, 0}, {0, 8, 9}};
        int[][] Array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}};
        int[][] SumArray = new int[Array1.length][Array1[0].length];
        int[][] SubArray = new int[Array1.length][Array1[0].length];

        for (int i = 0; i < SumArray.length; i++) {  //сложение
            for (int j = 0; j < SumArray[i].length; j++) {
                SumArray[i][j] = Array1[i][j] + Array2[i][j];
            }
        }
        System.out.println();

        for (int i = 0; i < SubArray.length; i++) {  //вычитание
            for (int j = 0; j < SubArray[i].length; j++) {
                SubArray[i][j] = Array1[i][j] - Array2[i][j];
            }
        }
        System.out.println();
        System.out.println("\tMatrix №1");
        for (int i = 0; i < Array1.length; i++) {  //вывод первого массиваа
            for (int j = 0; j < Array1[i].length; j++) {
                System.out.printf("%5d ", Array1[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("\tMatrix №2");
        for (int i = 0; i < Array2.length; i++) {  //вывод второго массива
            for (int j = 0; j < Array2[i].length; j++) {
                System.out.printf("%5d ", Array2[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("\tAddition");//вывод результата сложения
        for (int i = 0; i < SumArray.length; i++) {
            for (int j = 0; j < SumArray[i].length; j++) {
                System.out.printf("%5d ", SumArray[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("\tSubtraction"); //вывод результата вычитания
        for (int i = 0; i < SubArray.length; i++) {
            for (int j = 0; j < SubArray[i].length; j++) {
                System.out.printf("%5d ", SubArray[i][j]);
            }
            System.out.println();
            
        }
    }
}
