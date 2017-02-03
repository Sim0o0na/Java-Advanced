package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 26-Jan-17.
 */
public class UserLogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, HashMap<String, Integer>> info = new HashMap<>();
        while(true) {
            String line = scan.nextLine();
            if (line.equals("end")) {
                break;
            }
            int ipIndex = line.indexOf("IP=");
            int messageIndex = line.indexOf("message=");
            int userIndex = line.indexOf("user=");
            String user = line.substring(messageIndex+8, userIndex);
            String IP = line.substring(ipIndex + 3, messageIndex);
            if(!info.containsKey(user)){
                info.put(user);

            }else{
                info.get(user).put(IP, info.get(user).get(IP) + 1);
            }
            System.out.println(IP);
        }
        for(String user:info.keySet()){
            System.out.println(user + " - " + info.get(user));
        }
    }
}
