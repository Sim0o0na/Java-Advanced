package com.company;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 17-Jan-17.
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        if(firstName.isEmpty() && !secondName.isEmpty()){
            System.out.println(MessageFormat.format("Hello, ***** {0}!",secondName ));
        }
        if(secondName.isEmpty() && !firstName.isEmpty()){
            System.out.println(MessageFormat.format("Hello, {0} *****!", firstName ));
        }else if(!firstName.isEmpty() && !secondName.isEmpty()){
            System.out.println(MessageFormat.format("Hello, {0} {1}!", firstName, secondName ));
        }else if(firstName.isEmpty() && secondName.isEmpty()){
            System.out.println("Hello, ***** *****!");
        }
    }
}
