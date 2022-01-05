package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> alist = new ArrayList<>();
        alist.add("AA");
        alist.add("AA");
        alist.add("BB");
        alist.add("BB");
        alist.add("CC");
        alist.add("CC");

        HashSet<String> hset = new HashSet<>();
        for(String str :alist){
           hset.add(str);
        }
     //    Set<String> set;
     //   Collections.addAll(set = new HashSet<String>(Arrays.asList((arr))));
        System.out.println("Collection with duplicates contains " + alist);
        System.out.println("Collection without duplicates contains " + hset);
    }
}
