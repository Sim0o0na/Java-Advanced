package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 23-Jan-17.
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer number = scan.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();
        if(number.equals(0)){
            System.out.print(0);
        }else{
            while(number!=0){
                stack.push(number%2);
                number/=2;
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
