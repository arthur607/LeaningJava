package com.company.funcional;

import java.util.function.Function;
/**
 * Represents a function that accepts one argument and produces a result.
 * @param <T> the type of the input to the function
 * @param <R> the type of the result of the function
 *
 * @since 1.8
 */
public class OrdemXComportamento {

    public static void main(String[] args) {
        Function<Integer,Object> buscarRoupaPorId = idRoupa -> new Object();   //declaring comportment

        System.out.println(buscarRoupaPorIdImp(15));
    }
    public static Object buscarRoupaPorIdImp(int id){                         //declaring order
        return new Object();
    }
}
