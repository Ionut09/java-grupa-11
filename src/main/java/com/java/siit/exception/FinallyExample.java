package com.java.siit.exception;

public class FinallyExample {

    public static void main(String[] args) {
        String str = "";

        try {
            str += "a"; //str = str + "a";
            dangerousMethod(-2);
            str += "b";
        } catch (IllegalArgumentException e) { //cand exceptia este tratata ea nu mai cauzeaza oprirea programului
            str += "catch";
        } finally {
            str += "finally";
            System.out.println("==="+str+"\n");
        }

        //cand exceptia este tratata ea nu mai cauzeaza oprirea programului ci se continua cu ce mai e in main method
        str += "d";
        System.out.println("==="+str);
    }

    private static void dangerousMethod(int a) {
        if (a < 0) {
            throw new IllegalStateException("The argument cannot negative!"); //unchecked
        }
        System.out.println("end of dangerousMethod!!!");
    }
}
