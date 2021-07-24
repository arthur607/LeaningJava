package com.company.GenericsSetMap;

import java.util.HashSet;
import java.util.Set;

public class SetProgram {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();     //HashSet more fast implement, but don't guarantee the order of members
                                                //linkedHashSet order by insertions in program
                                                //order by alphabet's and totally order
        set.add("arthur");
        set.add("fabio");
        set.add("arthurrodrigusg@gmail.com.br");
        set.add("bob");
        set.add("@bob");


        set.removeIf(s -> s.length() >=10);
        set.removeIf(s -> s.charAt(0) == '@');         //predicate and condition


        System.out.println(set.contains("ararthurrodrigusg@gmail.com.br"));

        for (String p : set){
            System.out.println(p);
        }

    }
}
