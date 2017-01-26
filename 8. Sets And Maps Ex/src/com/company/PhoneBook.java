package com.company;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 25-Jan-17.
 */
public class PhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();
        while (true){
            String input = scan.nextLine();
            if(input.equals("search")){
                break;
            }else{
                String[] arrayed = input.split("-");
                if(!phonebook.containsKey(arrayed[0])){
                    phonebook.put(arrayed[0], arrayed[1]);
                }else{
                    phonebook.put(arrayed[0], arrayed[1]);
                }
            }
        }

        while(true){
            String inputSearch = scan.nextLine();
            if(inputSearch.equals("stop")){
                break;
            }else{
                if(phonebook.containsKey(inputSearch)){
                    System.out.println(inputSearch + " -> " + phonebook.get(inputSearch));
                }else{
                    System.out.println("Contact "+inputSearch+" does not exist.");
                }
            }
        }
    }
}
