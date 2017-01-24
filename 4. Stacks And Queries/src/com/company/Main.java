package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        ArrayDeque<Character> reversedInput = new ArrayDeque<>();

        for(Character ch: input.toCharArray()){
            reversedInput.push(ch);
        }

        while(!reversedInput.isEmpty()){
            System.out.print(reversedInput.pop());
        }

    }
}
