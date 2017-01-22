package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 18-Jan-17.
 */
public class FormattingNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();

        // Number in Hex
        String numberInHex = Integer.toHexString(firstNumber).toUpperCase();
        String numberInBinary = String.format("%10s",
                Integer.toBinaryString(firstNumber)).replace(' ', '0') ;

        // Output - here we check whether the third number is integer or float
        if (thirdNumber % 1 == 0) {
            System.out.printf("|%-10s|%s|%10.2f|%-10.0f|", numberInHex, numberInBinary,
                    secondNumber, thirdNumber);
        }
        else {
            System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", numberInHex, numberInBinary,
                    secondNumber, thirdNumber);
        }

    }

}
