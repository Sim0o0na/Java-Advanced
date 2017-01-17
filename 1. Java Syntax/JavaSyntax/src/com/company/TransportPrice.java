package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 17-Jan-17.
 */
public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer distance = scan.nextInt();
        scan.nextLine();
        String partOfDay = scan.nextLine();
        Double cost = 0.0;
        if(distance<20){
            if(partOfDay.equals("day")){
                cost=0.70+distance*0.79;
            }else{
                cost=0.70+distance*0.90;
            }
        }
        if(distance>=20 && distance<100){
            cost=distance*0.09;
        }
        if(distance>=100){
           cost=distance*0.06;
        }
        System.out.print(String.format("%.2f", cost));
    }
}
