package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Simona Simeonova on 24-Jan-17.
 */
public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<String> guestList = new HashSet<>();
        TreeSet<String> vip = new TreeSet<>();
        while(true){
            String input = scan.nextLine();
            if(input.equals("PARTY")){
                break;
            }else{
                guestList.add(input);
            }
        }
        System.out.print(guestList);
    }
}
