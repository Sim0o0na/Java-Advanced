package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 23-Jan-17.
 */
public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String expr = scan.nextLine();

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i <expr.length(); i++){
            char ch = expr.charAt(i);
            if (ch == '('){
                stack.push(i);
            }else if(ch ==')'){
                int start = stack.pop();
                String content = expr.substring(start, i+1);
                System.out.println(content);
            }
        }
     }
}
