package com.company;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 22-Jan-17.
 */
public class MatrixOfPalindromes {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        int val = 0;
        for (char ch = 'a'; ch <= 'z'; ++ch){
            map.put(val, String.valueOf(ch));
            val++;
        }

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] strArray = input.split(" ");
        Integer[] intArray = new Integer[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        Integer rows = intArray[0]; Integer cols = intArray[1];

        int middle = 0;
        for (int row = 0; row<rows; row++){
            for (int col = 0; col<cols; col++){
                System.out.print(map.get(row));
                System.out.print(map.get(middle));
                System.out.print(map.get(row));
                System.out.print(" ");
                middle++;
            }
            middle=row+1;
            System.out.println();
        }
    }
}
