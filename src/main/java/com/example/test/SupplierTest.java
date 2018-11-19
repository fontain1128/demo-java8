package com.example.test;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        // get method od supplier
        Supplier<Integer> supplier = () -> 1;
        Integer result = supplier.get();
        System.out.println(result);

        //

    }
}
