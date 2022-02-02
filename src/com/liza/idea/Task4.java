package com.liza.idea;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = new int[2][2];

        array[0][0] = 13;
        array[0][1] = -29;
        array[1][0] = -35;
        array[1][1] = 0;
        int PositiveNumberCounter = 0;
        int NegativeNumberCounter = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (array[i][j] > 0) {
                    PositiveNumberCounter++;
                } else if (array[i][j] < 0) {
                    NegativeNumberCounter++;
                }
            }
        }
        System.out.println("PositiveNumbersCounter = " + PositiveNumberCounter);
        System.out.println("NegativeNumbersCounter = " + NegativeNumberCounter);

        if (PositiveNumberCounter > NegativeNumberCounter) {
            System.out.println("There are more positive numbers");
        } else if (PositiveNumberCounter == NegativeNumberCounter) {
            System.out.println("Equal amount");
        } else {
            System.out.println("There are more negative numbers");
        }
    }
}
