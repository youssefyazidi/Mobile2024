package com.example.appandroid1;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args)
    {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        map.put(2, "Donnée 2");

        map.put(1, "Donnée 1");

        map.put(3, "Donnée 3");

        Set<Integer> set = map.keySet();

        for (Integer c : set) {

            System.out.print(" "+map.get(c));

        }
    }
    public static void before() {

        Set set = new TreeSet();

        set.add("2");

        set.add(3);

        set.add("1");

        Iterator it = set.iterator();

        System.out.print(it.next() + " ");

    }
}
