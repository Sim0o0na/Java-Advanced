package com.company;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 26-Jan-17.
 */
public class MinersTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String,Integer> info = new HashMap<>();
        int counter = 0;
        String currElement = "";
        while(true){
            String input = scan.nextLine();
            if(input.equals("stop")){
                break;
            }else{
                if(counter%2==0){
                    if(info.containsKey(input)){
                        currElement=input;
                        counter++;
                        continue;
                    }else{
                        currElement=input;
                        info.put(input, 0);
                    }
                }else{
                    info.put(currElement, info.get(currElement)+Integer.parseInt(input));
                }
            }
            counter++;
        }
        for(String key:info.keySet()){
            System.out.println(key +" -> " + info.get(key));
        }
    }
}
