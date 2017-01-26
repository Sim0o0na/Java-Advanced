package com.company;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Simona Simeonova on 25-Jan-17.
 */
public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] input = scan.nextLine().toCharArray();
        TreeMap<Character,Integer> set = new TreeMap<>();
        for(Character ch:input){
            if(!set.containsKey(ch)){
                set.put(ch, 1);
            }else{
                set.put(ch, set.get(ch) + 1);
            }
        }
        for(Character key:set.keySet()){
            System.out.println(key + ": "+set.get(key)+" time/s");
        }
    }
}
