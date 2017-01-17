package com.company;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 16-Jan-17.
 */
public class ReadInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] stings = scan.nextLine().split("\\s+");
        String string1 = stings[0]; String string2 = stings[1];
        Integer num1 = scan.nextInt();Integer num2 = scan.nextInt();Integer num3 = scan.nextInt();
        scan.nextLine();
        String string3 = scan.nextLine();

        System.out.print(MessageFormat.format("{0} {1} {2} {3}", string1, string2, string3, num1+num2+num3));

    }
}
