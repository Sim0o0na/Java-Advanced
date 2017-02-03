package com.company;

import java.util.*;

/**
 * Created by Simona Simeonova on 26-Jan-17.
 */
public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> cardsPowerInfo = new HashMap<>();
        LinkedHashMap<String, HashSet<String>> playersInfo = new LinkedHashMap<>();
        cardsPowerInfo.put("2", 2); cardsPowerInfo.put("3", 3); cardsPowerInfo.put("4", 4); cardsPowerInfo.put("5", 5);cardsPowerInfo.put("6", 6);cardsPowerInfo.put("7", 7);cardsPowerInfo.put("8", 8);cardsPowerInfo.put("9", 9);cardsPowerInfo.put("10", 10);cardsPowerInfo.put("J", 11);cardsPowerInfo.put("Q", 12);cardsPowerInfo.put("K", 13);cardsPowerInfo.put("A", 14);
        HashMap<String, Integer> type = new HashMap<>();
        type.put("S", 4); type.put("H", 3); type.put("D", 2); type.put("C", 1);
        LinkedHashMap<String, Integer> finalInfo = new LinkedHashMap<>();
        while (true){
            String input = scan.nextLine();
            if(input.equals("JOKER")){
                break;
            }else{
                String[] arrayed = input.split(": ");
                HashSet<String> cards = new HashSet<>();
                for (String s : arrayed[1].split(", ")) {
                    cards.add(s);
                }
                if(playersInfo.containsKey(arrayed[0])){
                    playersInfo.get(arrayed[0]).addAll(cards);
                }else{

                    playersInfo.put(arrayed[0], cards);
                }
            }
        }
        for(String key: playersInfo.keySet()){
            Integer cardsPower = 0;
            for(String card:playersInfo.get(key)){
                if(card.length() == 3){
                    cardsPower += (cardsPowerInfo.get(card.substring(0,2))*type.get(card.substring(2,3)));
                }else{
                    cardsPower += (cardsPowerInfo.get(card.split("")[0])*type.get(card.split("")[1]));
                }
            }
//            finalInfo.put(key, cardsPower);
            System.out.println(key + ": " + cardsPower);
        }
    }
}
