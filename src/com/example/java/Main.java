package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Convert conv = new Convert();
        ArrayList<String> alist = new ArrayList<>();
        alist.add("AA");
        alist.add("AA");
        alist.add("BB");
        alist.add("BB");
        alist.add("CC");
        alist.add("CC");
        alist.add("AA");
        alist.add("BB");
        System.out.println("Collection with duplicates contains " + alist);
        HashSet<String> newcol = conv.convert(alist);
        System.out.println("Collection with duplicates contains " + newcol);
    }
}
