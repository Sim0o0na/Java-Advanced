package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 22-Jan-17.
 */
public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] dimensions = input.split(" ");
        int rowsCount = Integer.parseInt(dimensions[0]);
        int colsCount = Integer.parseInt(dimensions[1]);
        Integer[][] matrix = new Integer[rowsCount][colsCount];

        for (int row = 0; row < rowsCount; row++) {
            for (int col = 0; col < colsCount; col++) {
                matrix[row][col] = scan.nextInt();
            }
        }

        int counterRow = 0;
        int counterCol = 0;

        long sum = Long.MIN_VALUE;
        for (int row = 0; row < rowsCount - 2; row++) {
            for (int col = 0; col < colsCount - 2; col++) {
                long currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (currentSum > sum) {
                    sum = currentSum;
                    counterRow = row;
                    counterCol = col;
                }
            }
        }
        System.out.println("Sum = " + sum);
        for (int row = counterRow; row < counterRow + 3; row++) {
            for (int col = counterCol; col < counterCol + 3; col++) {
                System.out.print(matrix[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

