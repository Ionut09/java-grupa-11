package com.java.siit.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Channels {
    public static void main(String[] args) throws IOException {
        String first = "/home/ionut/Desktop/workspace/java-grupa-11/src/main/resources/in.txt";
        Path path = Paths.get(first);

        FileChannel channel = FileChannel.open(path);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int bytesRead;

        while ((bytesRead = channel.read(buffer)) != -1) {
            System.out.println("bytes read: " + bytesRead);

            buffer.flip(); //make buffer ready for read
            byte[] bytesFromBuffer = new byte[bytesRead];
            buffer.get(bytesFromBuffer);

            System.out.println(new String(bytesFromBuffer, "UTF-8"));
            buffer.clear(); //make buffer ready for writing
            //bytesRead = channel.read(buffer);
        }
    }
}
