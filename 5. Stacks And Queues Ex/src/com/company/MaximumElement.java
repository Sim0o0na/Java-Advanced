package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 25-Jan-17.
 */
public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Integer numberOfCommands = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i<numberOfCommands; i++){
            String[] input = scan.nextLine().split(" ");
            if(input.length == 2){
                stack.push(Integer.parseInt(input[1]));
            }else if(input[0].equals("2")){
                if(stack.size()==0){
                    continue;
                }else{
                    stack.pop();
                }
            }else if(input[0].equals("3")){
                System.out.println(findMax(stack));
            }
        }
    }
    public static int findMax(ArrayDeque<Integer> stack) {
        Integer biggest = stack.pop();
        for (int i = 0; i < stack.size(); i++) {
            Integer current = stack.pop();
            if(current>biggest){
                biggest=current;
            }
        }
        return biggest;
    }
}
