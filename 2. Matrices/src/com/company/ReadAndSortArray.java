package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReadAndSortArray {
    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    Integer len = scan.nextInt();
	    scan.nextLine();
	    String[] arr = new String[len];
	    for(int i = 0; i<len; i++){
	        arr[i] = scan.nextLine();
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
