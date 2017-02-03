package com.company;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Simona Simeonova on 27-Jan-17.
 */
public class ListFiles {
    public static void main(String[] args) {
        Path path = Paths.get("E:\\Softuni\\Java\\Java Advanced\\9. Files And Directories" +
                                                        "\\Files-and-Streams\\Files-and-Streams");

        File file = new File("E:\\Softuni\\Java\\Java Advanced\\9. Files And Directories\\Files-and-Streams");

        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory())
                        System.out.println(f + ": " + f.length());
                }
            }
        }
    }
}
