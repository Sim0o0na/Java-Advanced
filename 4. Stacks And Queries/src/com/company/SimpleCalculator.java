package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 23-Jan-17.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        Deque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, input);

        while (stack.size() > 1){
            int first = Integer.valueOf(stack.pop());
            String operator = stack.pop();
            int second = Integer.valueOf(stack.pop());

            switch (operator){
                case "+":
                    stack.push(String.valueOf(first+second)); break;
                case "-":
                    stack.push(String.valueOf(first-second)); break;
            }
        }
        System.out.print(stack.pop());
    }
}
