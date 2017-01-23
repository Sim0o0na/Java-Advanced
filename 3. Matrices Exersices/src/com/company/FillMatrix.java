package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 22-Jan-17.
 */
public class FillMatrix
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        if(input[1]=="A"){
            patternA(Integer.parseInt(input[0]));
        }else if(input[1]=="B"){
            patternB(Integer.parseInt(input[0]);
        }
    }
    public static Integer[] patternA(int size){
        Integer[] matrix = new Integer[size];
        int counter = 0;
        for (int col = 0; col<size; col++){
            for(int row = 0; row<size; row++){
                matrix[col][row] = size;
            }
        }
        return matrix;
    }
}
