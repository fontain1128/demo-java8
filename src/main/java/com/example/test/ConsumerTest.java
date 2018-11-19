package com.example.test;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        // accept method of consumer
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(1);

        // add then method of consumer
        Consumer<Integer> consumerAddThen = x -> System.out.println("add Then = " + x);
        consumer.andThen(consumerAddThen).accept(1);


    }
}
