package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 22-Jan-17.
 */
public class MaxSequenceInMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] sequence = input.split(" ");
        //System.out.println(String.join(" ",sequence));
        int maxnumbers = 0;
        int count = 1;
        int maxcount = 1;
        int pos = 0;
        while (pos<sequence.length-1){
            int num1=Integer.parseInt(sequence[pos]);
            int num2=Integer.parseInt(sequence[pos+1]);
            if (num1==num2){
                count++;
                if (count>maxcount){
                    maxcount=count;
                    maxnumbers=num1;
                }
            }
            else {
                count=1;
            }
            pos++;
            if (maxcount==1){
                int num0=Integer.parseInt(sequence[0]);
                maxnumbers=num0;
            }
        }
        for (int i = 0; i < maxcount; i++)
        {
            System.out.print(maxnumbers);
            System.out.print(" ");
        }
    }
}
