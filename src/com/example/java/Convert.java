package com.example.java;

import java.util.*;

public class Convert {

    public <T> HashSet<T> convert(ArrayList<T> alist) {
        HashSet<T> hset = new HashSet<T>();
        for (T item : alist) {
            hset.add(item);
        }
        return hset;
    }
}
