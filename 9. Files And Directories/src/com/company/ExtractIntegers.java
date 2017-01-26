package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Simona Simeonova on 26-Jan-17.
 */
public class ExtractIntegers {
    public static void main(String[] args) {
        String inputPath = "E:\\input.txt";
        String outputPath = "E:\\output.txt";

        try (Scanner scanner = new Scanner(new FileInputStream(inputPath));
             PrintWriter out = new PrintWriter(new FileOutputStream(outputPath))) {
            while (scanner.hasNext()) {
                     if (scanner.hasNextInt()) {
                         out.println(scanner.nextInt());
                     }

                     scanner.next();
                 }
             }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
