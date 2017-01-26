package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    String input = "E:\\input.txt";
        String output = "E:\\output.txt";
        HashSet<Character> punc = new HashSet<>();
        Collections.addAll(punc, ',', '.', '!', '?');
	    try(FileInputStream fis = new FileInputStream(input);
            FileOutputStream fos = new FileOutputStream(output)){
	        int oneByte = fis.read();
	        while((oneByte = fis.read())>=0){
	            if(!punc.contains((char)oneByte)){
                    fos.write(oneByte);
                }
            }
        }
        catch(IOException e){
                e.printStackTrace();
        }
    }
}
