package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Convert conv = new Convert();
        ArrayList<String> alist = new ArrayList<>(Arrays.asList("AA", "BB", "CC","DD","DD", "AA", "BB","CC"));
        System.out.println("Collection with duplicates contains " + alist);
        HashSet<String> newcol = conv.convert(alist);
        System.out.println("Collection with duplicates contains " + newcol);
    }
}
