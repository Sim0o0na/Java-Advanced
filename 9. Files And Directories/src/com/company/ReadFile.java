package com.company;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Simona Simeonova on 26-Jan-17.
 */
public class ReadFile
{
    public static void main(String[] args) {
        String path = "E:\\input.txt";

        try (FileInputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = in.read();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
