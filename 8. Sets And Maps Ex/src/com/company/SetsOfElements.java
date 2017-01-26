package com.company;

import java.util.*;

/**
 * Created by Simona Simeonova on 25-Jan-17.
 */
public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        Integer firstLen = Integer.parseInt(input[0]);
        Integer secondLen = Integer.parseInt(input[1]);
        HashSet<Integer> first = new HashSet<>();
        HashSet<Integer> second = new HashSet<>();

        for (int i = 0; i < firstLen; i++) {
            Integer curr = scan.nextInt();
            first.add(curr);
        }
        for (int i = 0; i < secondLen; i++) {
            Integer curr = scan.nextInt();
            second.add(curr);
        }

        Set<Integer> intersection = new HashSet<>(first); // use the copy constructor
        intersection.retainAll(second);
        intersection.retainAll(first);
        for(Integer element:intersection){
            System.out.print(element + " ");
        }
    }
}
