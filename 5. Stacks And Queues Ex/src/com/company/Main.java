package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0 ;i<input.length; i++){
            stack.push(Integer.parseInt(input[i]));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.poll() + " ");
        }
    }
}
