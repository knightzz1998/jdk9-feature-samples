package cn.knightzz.chapter06;

import java.lang.invoke.LambdaMetafactory;
import java.util.function.Function;

/**
 * @author 王天赐
 * @title LambdaTest
 * @description
 * @create 2024-06-19 14:53
 */
public class LambdaTest {

    public static void main(String[] args) {
        handler(num -> "name: " + String.valueOf(num), 100);
    }

    public static String handler(Function<Integer, String> function, Integer str) {
        return function.apply(str);
    }
}


/*

package cn.knightzz.chapter06;

import java.lang.invoke.LambdaMetafactory;
import java.util.function.Function;

public class LambdaTest {
    public static void main(String[] args) {
        LambdaTest.handler((Function<Integer, String>) LambdaMetafactory.metafactory(
        null,
        null,
        null,
        (Ljava/lang/Object;)Ljava/lang/Object;,

        lambda$main$0(java.lang.Integer ), // 最终要执行的方法
        (Ljava/lang/Integer;)Ljava/lang/String;)(),
        100);
    }

    public static String handler(Function<Integer, String> function, Integer str) {
        return function.apply(str);
    }

    private static String lambda$main$0(Integer num) {
        return "name: " + String.valueOf(num);
    }
}

 */