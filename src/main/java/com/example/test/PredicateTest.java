package com.example.test;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        //test method of predicate
        Predicate<String> predicate = x -> x != null;
        boolean a = predicate.test("a");//true
        System.out.println(a);

        //default method and of predicate
        Predicate<String> predicateAnd = x -> x != "";
        boolean b = predicate.and(predicateAnd).test("b");//true
        System.out.println(b);

        //default method or of predicate
        boolean c = predicate.or(predicateAnd).test("c");//true
        System.out.println(c);

        //default method negate of predicate
        Predicate<String> predicateNegate = predicate.negate();
        boolean d = predicateNegate.test("d");//false
        System.out.println(d);

        //static method isEqual
        Predicate<String> predicateEqual = Predicate.isEqual("e");
        Boolean e = predicateEqual.test("e");//true
        System.out.println(e);

        predicateEqual = Predicate.isEqual(null);
        Boolean e2 = predicateEqual.test(null);//true
        System.out.println(e2);


    }
}
