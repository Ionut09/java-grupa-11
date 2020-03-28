package com.java.siit.oop;

public class LongestSubstring {


    private static final int CHARS_NUM = 256;

    public static void main(String[] args) {
        String str = "ABDEFGABEF";
        System.out.println("The input string is " + str);
        int length = longestSubstring(str);
        System.out.println("The length of the longest non repeating character is " + length);
    }

    private static int longestSubstring(String str) {
        int n = str.length();
        int currentLength = 1; // length of current substring
        int maxLength = 1; // result
        int previousIndex; // previous index
        int[] visited = new int[CHARS_NUM];


        for (int i = 0; i < CHARS_NUM; i++) {
            visited[i] = -1;
        }

        visited[str.charAt(0)] = 0;

        for (int i = 1; i < n; i++) {
            previousIndex = visited[str.charAt(i)];

            if (previousIndex == -1 || i - currentLength > previousIndex)
                currentLength++;
            else {
                if (currentLength > maxLength)
                    maxLength = currentLength;

                currentLength = i - previousIndex;
            }

            visited[str.charAt(i)] = i;
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
        }

        return maxLength;
    }
}


