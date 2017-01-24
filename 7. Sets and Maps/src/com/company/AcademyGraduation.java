package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Simona Simeonova on 24-Jan-17.
 */
public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, Double[]> info = new TreeMap<>();
        String n = scan.nextLine();
        for(int i = 0; i<Integer.parseInt(n); i++){
            String name = scan.nextLine();
            String[] grades = scan.nextLine().split(" ");
            Double[] scores = new Double[grades.length];
            Double sum = 0.0;
            for (int j=0;j<scores.length; j++){
                sum+=Double.parseDouble(grades[j]);
                scores[j] = Double.parseDouble(grades[j]);
            }
            info.put(name, scores);
        }
        for (String key : info.keySet()) {
            Double sum = 0.0;
            for(Double grade : info.get(key)){
                sum+=grade;
            }
            System.out.println(key + " is graduated with " + sum/info.get(key).length);
        }
    }
}
