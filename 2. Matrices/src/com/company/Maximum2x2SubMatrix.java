package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 19-Jan-17.
 */
public class Maximum2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");

        Integer rows = Integer.valueOf(input[0]);
        Integer cols = Integer.valueOf(input[1]);

        int[][] matrix = new int [rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] line = scan.nextLine().split(", ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(line[col]);
            }
        }
        long sum = 0;
        int[][] matrix2 = new int [2][2];
        for (int row = 0; row<rows-1; row++ ){
            for (int col = 0; col<cols-1; col++ ){
                long currentSum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (currentSum > sum)
                {
                    matrix2[0][0] = matrix[row][col];
                    matrix2[0][1] = matrix[row][col+1];
                    matrix2[1][0] = matrix[row+1][col];
                    matrix2[1][1] = matrix[row+1][col+1];
                    sum = currentSum;
                }
            }
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(sum);
    }
}
