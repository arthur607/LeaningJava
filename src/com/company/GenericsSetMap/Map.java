package com.company.GenericsSetMap;


import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {

        java.util.Map<String,String> cookies = new TreeMap<>();    //type of keu and type of value, treeMap is more fast but don't guarantee a ordination of values

        cookies.put("name", "arthur");
        cookies.put("email", "arthur@gamail.com");
        cookies.put("phone", "45635");

        cookies.size();

        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
