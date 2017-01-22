package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 18-Jan-17.
 */
public class RectangleArea
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double num1 = scan.nextDouble();
        Double num2 = scan.nextDouble();
        double area = num1*num2;
        System.out.print(String.format("%.2f", area));

    }
}
