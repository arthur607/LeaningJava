package com.company.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,10,9);

        java.util.stream.Stream<Integer> st1 = list.stream().map(a ->  a * 10);    //convert list to stream, and apply lambda in elements


        System.out.println(Arrays.toString(st1.toArray()));  //     print out the stream

        java.util.stream.Stream<String> st2 = java.util.stream.Stream.of("Arthur", "fabio", "roger");

        java.util.stream.Stream<Integer> st3 = java.util.stream.Stream.iterate(0, x -> x + 2);  //infinity

        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        int sum = list.stream().reduce(0,(x,y) -> x + y);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 5)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));
    }
}
