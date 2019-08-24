package com.java.siit.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {

    public static void main(String[] args) throws IOException {

        try (FileInputStream in = new FileInputStream("/home/ionut/Desktop/workspace/java-grupa-11/src/main/resources/in.txt");
             FileOutputStream out = new FileOutputStream("/home/ionut/Desktop/workspace/java-grupa-11/src/main/resources/out.txt")) {
            int val;
            while ((val = in.read()) != -1) {
                System.out.println(val);
                out.write(val);
            }
        }

        System.out.println("Am copiat fisierul!!!");
    }
}
