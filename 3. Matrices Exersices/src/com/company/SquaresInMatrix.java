package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 22-Jan-17.
 */
public class SquaresInMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] dimensions = input.split(" ");
        int rowsCount=Integer.parseInt(dimensions[0]);
        int colsCount=Integer.parseInt(dimensions[1]);
        String[][] matrix = new String[rowsCount][colsCount];

        for (int row = 0; row < rowsCount; row++) {
            for (int col = 0; col < colsCount; col++) {
                matrix[row][col] = scan.next();
            }
        }
        int count=0;
        for (int row = 0; row < rowsCount-1; row++) {
            for (int col = 0; col < colsCount-1; col++) {
                if(matrix[row][col].equals(matrix[row][col + 1])  &&
                        matrix[row][col].equals(matrix[row + 1][col]) &&
                        matrix[row][col].equals(matrix[row + 1][col + 1]) ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
