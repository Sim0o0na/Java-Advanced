package com.company;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 19-Jan-17.
 */
public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");

        Integer rows = Integer.valueOf(input[0]);
        Integer cols = Integer.valueOf(input[1]);

        int[][] matrix = new int [rows][cols];
        Integer sum = 0;

        for (int row = 0; row < rows; row++) {
            String[] line = scan.nextLine().split(", ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(line[col]);
                sum+=matrix[row][col];
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);


    }
}
