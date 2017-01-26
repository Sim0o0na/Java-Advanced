package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashSet<String> usernames = new LinkedHashSet<>();
        Integer num = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < num; i++){
            String username = scan.nextLine();
            if(!usernames.contains(username)){
                usernames.add(username);
            }
        }
        for(String username:usernames){
            System.out.println(username);
        }
    }
}
