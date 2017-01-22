package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 18-Jan-17.
 */
public class OddEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] intarr = new int[input.length];
        if(input.length%2==0) {
            for (int i = 0; i < input.length; i++)
                intarr[i] = Integer.parseInt(input[i]);

        }else{
            System.out.print("invalid length");
        }
    }
}
