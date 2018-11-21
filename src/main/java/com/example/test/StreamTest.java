package com.example.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
//        List<Integer> toFilterNums = Arrays.asList(1, 2, 3, 4, 5);
//        Integer[] filterNums = toFilterNums.stream().filter(x -> x < 3).toArray(Integer[]::new);
//        Arrays.stream(filterNums).forEach(x -> System.out.println(x));

        //foreach操作 同一个stream不能二次消费，即teminal操作只能执行一次
        //java.lang.IllegalStateException: stream has already been operated upon or closed
        //不能用 break/return 之类的关键字提前结束循环。
        //不能修改foreach代码之外的变量(内存泄漏)
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
//        Stream<Integer> numStream = nums.stream().filter(x -> x <= 4);
//        numStream.forEach(x -> System.out.println(x));
//        numStream.forEach(x -> System.out.println(x));


        //peek 对遍历的每一个元素返回新的stream
//        Stream.of("one","two","three").filter(x -> x.length() <= 3).peek(x -> System.out.println(x))
//            .map(String::toUpperCase).peek(x -> System.out.println(x)).collect(Collectors.toList());

        //findfirst terminal操作，返回第一个元素
        Stream.of(3,1,5,4,9).sorted().findFirst().ifPresent(x -> System.out.println(x));

        //Optional可以理解为一个容器，可能包含值也可能不包含值，findFirst返回值就是Optional
        //Optional可以用来避免npe，是编译时检查，避免在运行时出现npe
        String param = null;
        Optional.ofNullable(param).ifPresent(x -> System.out.println(x));
        //pre java8
        if (param != null){
            System.out.println(param);
        }
        //可见使用Optional更简洁，如果对于param的判断更复杂，会更体现出Optional的作用

        //











    }
}
