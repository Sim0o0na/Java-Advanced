package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * Created by Simona Simeonova on 26-Jan-17.
 */
public class CopyBytes {
    public static void main(String[] args) {
        Path path = Paths.get("E:\\input.txt");
        Path output = Paths.get("E:\\output.txt");

        try {
            List<String> lines = Files.readAllLines(path);
            Collections.sort(lines);
            Files.write(output, lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
