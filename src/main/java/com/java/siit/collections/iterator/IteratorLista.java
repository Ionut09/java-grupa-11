package com.java.siit.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorLista {
    public static void main(String[] args) {

        List<Computer> list = new ArrayList<>();

        Iterator<Computer> iterator = list.iterator();
        while (iterator.hasNext()){
           Computer computer = iterator.next();

           if(computer.equals(new Computer("Apple",""))){
               iterator.remove();
               // list.remove(new Computer("Apple")); //incorect pt ca o sa arunce ConcurrentModificationException
           }
        }

        String format = String.format("http://locahost:%d/%s", 8080, "url");
        System.out.println(format);


    }
}
