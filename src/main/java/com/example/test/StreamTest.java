package com.example.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
//        // map操作 转换大写
//        List<String> wordList = Arrays.asList("a","b","c");
//        List<String> wordUpperList = wordList.stream().map(String::toUpperCase).collect(Collectors.toList());
//        wordUpperList.forEach( x -> System.out.println(x));
//
//        //map操作 平方运算
//        List<Integer> nums = Arrays.asList(1,2,3);
//        nums.stream().map(x -> x*x).collect(Collectors.toList());
//
//        //flatmap 将多个list的的元素抽出来放到一个stream里
//        List<Integer> numForFlat = Arrays.asList(1);
//        List<Integer> numForFlat2 = Arrays.asList(1, 2);
//        List<Integer> numForFlat3  =Arrays.asList(1, 2, 3);
//        List<Integer> flatList = Stream.of(numForFlat, numForFlat2, numForFlat3).
//                flatMap(childList -> childList.stream().map(x -> x*x)).collect(Collectors.toList());
//        flatList.forEach(x -> System.out.println(x));

        //filter 取出小于3的数据并输出
        List<Integer> toFilterNums = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] filterNums = toFilterNums.stream().filter(x -> x < 3).toArray(Integer[]::new);
        Arrays.stream(filterNums).forEach(x -> System.out.println(x));







    }
}
