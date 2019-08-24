package com.java.siit.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FilesUtilityClass {

    public static void main(String[] args) throws IOException {
        String in = "/home/ionut/Desktop/workspace/java-grupa-11/src/main/resources/in.txt";
        String out = "/home/ionut/Desktop/workspace/java-grupa-11/src/main/resources/out.txt";

        Files.copy(path(in), path(out), REPLACE_EXISTING);
        //Charset.forName("kdmskfUTF-8");// Inteliij rocks
        Stream<String> lines = Files.lines(path(in), UTF_8);

        BufferedWriter bufferedWriter = Files.newBufferedWriter(path(out));
        lines.filter(line -> line.length() > 10)
             //.map(line -> line.toUpperCase())
             .map(String::toUpperCase)  //cu method reference
             .peek(System.out::println)
             .forEach(line -> writeLineInFile(bufferedWriter, line));

        Stream<Path> pathsUnderHome = Files.walk(path("/home"), 10);
        pathsUnderHome.filter(path -> !path.toFile().isHidden())
                      .forEach(System.out::println);

    }

    private static void writeLineInFile(BufferedWriter bufferedWriter, String line) {
        try {
            bufferedWriter.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Path path(String in) {
        return Paths.get(in);
    }
}
