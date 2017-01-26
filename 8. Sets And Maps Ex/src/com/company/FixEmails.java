package com.company;


import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 26-Jan-17.
 */
public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String,String> info = new HashMap<>();
        int counter = 0;
        String currName = "";
        while(true){
            String input = scan.nextLine();
            if(input.equals("stop")){
                break;
            }else{
                if(counter%2==0){
                    if(info.containsKey(input)){
                        currName=input;
                        counter++;
                        continue;
                    }else{
                        currName=input;
                        info.put(input, null);
                    }
                }else{
                    info.put(currName,input);
                }
            }
            counter++;
        }
        for(String key:info.keySet()){
            Integer index = info.get(key).indexOf('.');
            String domain = info.get(key).substring(index+1, info.get(key).length());
//            System.out.println(domain);
            if(!domain.equals("us") && !domain.equals("uk") && !domain.equals("com")){
                System.out.println(key + " -> " + info.get(key));
            }
        }
    }
}
