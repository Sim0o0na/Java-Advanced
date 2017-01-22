package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 18-Jan-17.
 */
public class DecimalToBase7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numberToConvert = scan.nextLine();
        Integer decimalNum = Integer.valueOf(numberToConvert, 7);
        System.out.print(decimalNum);
    }
}
