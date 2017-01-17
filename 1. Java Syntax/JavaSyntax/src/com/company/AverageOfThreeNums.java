package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 17-Jan-17.
 */
public class AverageOfThreeNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double avg = (num1+num2+num3)/3;
        System.out.print(String.format("%.2f", avg) );
    }
}
