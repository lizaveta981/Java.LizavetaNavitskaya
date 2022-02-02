package com.liza.idea;

public class Task5 {
        public static void main(String[] args) {
            int[][] array = new int[3][3];

            array[0][0] = 1;
            array[0][1] = 0;
            array[0][2] = 0;
            array[1][0] = 3;
            array[1][1] = 6;
            array[1][2] = 0;
            array[2][0] = 8;
            array[2][1] = 4;
            array[2][2] = 2;
            int ZeroCounter = 0;
            int DiagonalElementsCounter = 0;
            int TheNumberOfAllElements = 0;
            int TheNumberOfBottomElements = 0;


            for (int i = 0; i < array.length; i++) {   //выводит заданную матрицу
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    TheNumberOfAllElements = array[i].length * array[j].length;
                    if (array[i][j] == 0 && i < j) {   //считает нули в верхней части матрицы
                        ZeroCounter++;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == j) {
                        DiagonalElementsCounter++;  //считает сколько элементов в диагонали
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i > j) {
                        TheNumberOfBottomElements++;   //считает сколько элементов нижней части матрицы
                    }
                }
            }
            System.out.println("TheNumberOfBottomElements = " + TheNumberOfBottomElements);
            System.out.println("TheNumberOfAllElements = " + TheNumberOfAllElements);
            System.out.println("ZeroCounter = " + ZeroCounter);
            System.out.println("DiagonalElementsCounter = " + DiagonalElementsCounter);
            if(TheNumberOfAllElements - TheNumberOfBottomElements - DiagonalElementsCounter == ZeroCounter) {
                System.out.println("This is a lower triangular matrix");
            }
        }
    }
