package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 17-Jan-17.
 */
public class EuroTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double wurstQuantity = scan.nextDouble();
        double price = (wurstQuantity*1.20)*4210500000000L;
        System.out.print(String.format("%0 marks", Math.round(price)));
    }
}
