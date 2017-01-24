package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 23-Jan-17.
 */
public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] children = scan.nextLine().split(" ");
        int num = Integer.valueOf(scan.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String child: children){
            queue.offer(child);
        }

        while (queue.size()>1){
            for(int i = 1; i<num; i++){
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is "+queue.poll());
    }
}
