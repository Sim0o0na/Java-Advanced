package com.company;

import java.io.*;

/**
 * Created by Simona Simeonova on 26-Jan-17.
 */
public class WriteEveryThirdLine {
    public static void main(String[] args) {
        String inputPath = "E:\\input.txt";
        String outputPath = "E:\\output.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(inputPath));
            PrintWriter out = new PrintWriter(new FileWriter(outputPath))){
            int counter = 1;
            String line = in.readLine();
            while(line!=null){
                if(counter%3==0){
                    out.println(line);
                }
                counter++;
                line = in.readLine();
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
