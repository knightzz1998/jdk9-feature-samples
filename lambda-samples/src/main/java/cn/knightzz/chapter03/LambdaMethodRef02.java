package cn.knightzz.chapter03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author 王天赐
 * @title LambdaMethodRef02
 * @description 方法引用类型
 * @create 2024-06-20 08:57
 */
public class LambdaMethodRef02 {

    public static void main(String[] args) {

        // 1. 引用静态方法
        Function<Integer, String> f01 = s -> String.valueOf(s);
        Function<Integer, String> func01 = String::valueOf;
        System.out.println(func01.apply(123)); // 输出 "123"

        // 2. 引用实例方法
        Function<String, Integer> f02 = s -> s.length();
        Function<String, Integer> func02 = String::length;
        System.out.println(func02.apply("hello")); // 输出 5

        // 3. 引用特定对象的实例方法
        String str = "hello";
        Supplier<Integer> f03 = () -> str.length();
        Supplier<Integer> func = str::length;
        System.out.println(func.get()); // 输出 5

        // 4. 引用构造方法
        Supplier<List<String>> s01 = () -> new ArrayList<>();
        Supplier<List<String>> supplier = ArrayList::new;
        List<String> list = supplier.get();

    }
}
