package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Simona Simeonova on 25-Jan-17.
 */
public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();
        scan.nextLine();
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i <num; i++){
            String[] input = scan.nextLine().split(" ");
            for(String element:input){
                if(!set.contains(element)){
                    set.add(element);
                }
            }
        }
        for(String element:set){
            System.out.print(element + " ");
        }
    }
}
