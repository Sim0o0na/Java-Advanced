package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashSet<String> parking = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        while(true){
            String[] input = scan.nextLine().split("\\s*,\\s*");
            if (input[0].equals("END")){
                break;
            }
            String direction = input[0];
            String carNumber = input[1];
            if(direction.equals("IN")){
                parking.add(carNumber);
            }else{
                parking.remove(carNumber);
            }
        }
        if(parking.isEmpty()){
            System.out.print("Parking Lot is Empty");
        }else if(!parking.isEmpty()){
            for(String number:parking){
                System.out.println(number);
            }
        }
    }
}
