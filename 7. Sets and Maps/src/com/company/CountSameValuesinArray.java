package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 24-Jan-17.
 */
public class CountSameValuesinArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split("\\s+");

        HashMap<String, Integer> result = new HashMap<>();
        for (int i = 0; i< array.length; i++){
            if(!result.containsKey(array[i])){
                result.put(array[i], 1);
            }else{
                result.put(array[i], result.get(array[i]) + 1 );
            }
        }

        for (String key : result.keySet()) {
            System.out.println(key + " - " + result.get(key)+ " times");
        }
    }
}
