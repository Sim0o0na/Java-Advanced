package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 19-Jan-17.
 */
public class GroupNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        List<Integer> nullRemainder = new ArrayList<Integer>();
        List<Integer> oneRemainder = new ArrayList<Integer>();
        List<Integer> twoRemainder = new ArrayList<Integer>();


        for(int i = 0; i < input.length; i++){
            Integer currentNum = Integer.parseInt(input[i]);
            if(currentNum%3==0){
                nullRemainder.add(currentNum);
            }
            if(currentNum%3==1 || currentNum%3==-1){
                oneRemainder.add(currentNum);
            }
            if(currentNum%3==2 || currentNum%3==-2){
                twoRemainder.add(currentNum);
            }
        }

//        System.out.println(Arrays.toString(nullRemainder.toArray()));
//        System.out.println(Arrays.toString(oneRemainder.toArray()));
//        System.out.println(Arrays.toString(twoRemainder.toArray()));
        System.out.println(Arrays.asList(nullRemainder).toString().substring(1).replace(", ", " ").replace("]", "").replace("[", ""));
        System.out.println(Arrays.asList(oneRemainder).toString().substring(1).replace(", ", " ").replace("]", "").replace("[", ""));
        System.out.println(Arrays.asList(twoRemainder).toString().substring(1).replace(", ", " ").replace("]", "").replace("[", ""));
    }
}

