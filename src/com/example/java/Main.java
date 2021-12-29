package com.example.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String arr [] = {"AA", "BB", "CC", "CC", "BB", "AA", "NN"};
        Set<String> set;
        Collections.addAll(set = new HashSet<String>(Arrays.asList((arr))));
        System.out.println("Collection without duplicates contains" + set);
    }
}
