package com.company.GenericsSetMap;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@Setter
@Getter
public class PrintServiceGeneric<T> {
    String testeComGetterESetter;

    @ToString.Exclude
    @Setter(value = AccessLevel.NONE)
    @Getter(value = AccessLevel.NONE)
    String testeSemGetterESetter;


    private List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");   //method to check if list is empty
        }
        return list.get(0);
    }


    public void print(){
        System.out.print("[");
        if (!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for(int i = 1; i < list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
