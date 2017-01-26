package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 25-Jan-17.
 */
public class BasicStackOps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer elToPush = scan.nextInt();
        Integer elToPop = scan.nextInt();
        Integer toCheck = scan.nextInt();
        scan.nextLine();
        String[] elements = scan.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < elToPush; i++) {
            stack.push(Integer.parseInt(elements[i]));
        }
        Integer counter = 0;
        while (!counter.equals(elToPop)) {
            stack.pop();
            counter++;
        }
        if (stack.contains(toCheck)) {
            System.out.println("true");
        } else if(stack.size()==0) {
            System.out.println(0);
        }else{
            System.out.println(findMin(stack));
        }
    }

    public static int findMin(ArrayDeque<Integer> stack) {
        Integer smallest = stack.pop();
        for (int i = 0; i < stack.size(); i++) {
            Integer current = stack.pop();
            if(current<smallest){
                smallest=current;
            }
        }
        return smallest;
    }
}

