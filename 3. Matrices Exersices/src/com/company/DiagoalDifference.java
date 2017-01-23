package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 22-Jan-17.
 */
public class DiagoalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[][] matrix = new int[input][input];

        for (int row = 0; row < input; row++) {
            for (int col = 0; col < input; col++) {
                matrix[row][col] = scan.nextInt();
            }
        }
        //firstDiagonal
        int firstDiagonalSum = 0;
        for (int i = 0; i < input; i++) {
            firstDiagonalSum += matrix[i][i];
        }


        //secondDiagonal
        int secondDiagonalSum = 0;
        for (int j = 0; j < input; j++) {
            secondDiagonalSum += matrix[j][input - 1 - j];
        }
        int difference = Math.abs(firstDiagonalSum - secondDiagonalSum);
        System.out.print(difference);
    }
}
