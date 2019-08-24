package com.java.siit.io;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.stream.Collectors.toMap;

/**
 * input: text file with any number of lines (max. 10MB)
 * output: words sorted by number of occurrences
 */
public class ExerciseInterviuStreams {

    public static void main(String[] args) {
        ExerciseInterviuStreams tool = new ExerciseInterviuStreams();
        String stringPath = "/home/ionut/Desktop/workspace/java-grupa-11/src/main/resources/in.txt";

        Map<String, Integer> wordsMap = tool.readFile(stringPath);
        wordsMap = tool.sortByOccurences(wordsMap);

        wordsMap.entrySet()
                .forEach(System.out::println);


    }

    private Map<String, Integer> sortByOccurences(Map<String, Integer> wordsMap) {
        return wordsMap.entrySet()
                       .stream()
                       //.sorted((e1, e2)-> e1.getValue().compareTo(e2.getValue()))
                       .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                       .collect(toMap(Entry::getKey,
                               Entry::getValue,
                               (v1, v2) -> v1,
                               LinkedHashMap::new));

    }


    private Map<String, Integer> readFile(String pathString) {
        Map<String, Integer> words = new LinkedHashMap<>();
        Path path = Paths.get(pathString);
        try {

            Files.lines(path)
                 .map(s -> s.split("[^a-zA-Z]")) //Stream<String[]>
                 .flatMap(Arrays::stream) //Stream<String>
                 .filter(StringUtils::isNotEmpty)
                 .forEach(word -> putWordInMap(words, word));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return words;
    }

    private void putWordInMap(Map<String, Integer> words, String word) {
        if (words.containsKey(word)) {
            words.put(word, words.get(word) + 1);
        } else {
            words.put(word, 1);
        }
    }
}
