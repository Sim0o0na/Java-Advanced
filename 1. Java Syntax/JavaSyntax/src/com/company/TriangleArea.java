package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 18-Jan-17.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer x1 = scan.nextInt();
        Integer y1 = scan.nextInt();
        Integer x2 = scan.nextInt();
        Integer y2 = scan.nextInt();
        Integer x3 = scan.nextInt();
        Integer y3 = scan.nextInt();

        Integer result = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;
        System.out.println(Math.abs(result));
    }
}
