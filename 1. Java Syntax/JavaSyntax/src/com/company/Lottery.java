package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 17-Jan-17.
 */
public class Lottery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double base = scan.nextDouble();
        Double height = scan.nextDouble();
        System.out.print("Area = " + String.format("%.2f", TriangleArea(base, height)));
    }
    public static double TriangleArea(Double base, Double height){
        Double area = (base * height) /2;
        return  area;
    }
}
