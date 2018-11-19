package com.example.test;

import java.util.function.Function;


public class FunctionTest {

    public static void main(String[] args) {

        //lambda imple apply of Function<T, R>
        Function<Integer, Integer> functionAddByLambda = x -> x + 10;
        System.out.println(functionAddByLambda.apply(10));//20

        //common way 匿名内部类类似Runnable interface
        Function<Integer, Integer> functionAddCommon = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 10;
            }
        };
        System.out.println(functionAddCommon.apply(10));//20

        //compare 很明显lambda更简洁

        //default method compose(Function<? super V, ? extends T> before)
        Function<Integer, Integer> functionAddBefore = x -> x + 10;
        Function<Integer, Integer> functionMultiAfter = x -> x * 10;
        Function<Integer, Integer> functionCompose = functionMultiAfter.compose(functionAddBefore);
        System.out.println( functionCompose.apply(10));//200

        //default method addThen(Function<? super R, ? extends V> after)
        Function<Integer, Integer> functionComposeAddThen = functionMultiAfter.andThen(functionAddBefore);
        System.out.println(functionComposeAddThen.apply(10));//110

        //static method identity identity()
        Function<Integer, Integer> functionIdeatity = Function.identity();
        System.out.println(functionIdeatity.apply(10));









    }

}
