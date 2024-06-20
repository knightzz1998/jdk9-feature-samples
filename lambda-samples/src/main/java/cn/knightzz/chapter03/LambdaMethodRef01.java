package cn.knightzz.chapter03;

import java.awt.print.Printable;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author 王天赐
 * @title LambdaMethodRef01
 * @description 方法引用Demo
 * @create 2024-06-20 08:48
 */
public class LambdaMethodRef01 {

    public static void main(String[] args) {

        // 有时候我们仅仅是调用了一个已存在的方法。如下：
        Arrays.asList("a", "b", "c").forEach(s -> {
            System.out.println(s);
        });
        // 在Java8中，我们可以直接通过方法引用来简写lambda表达式中已经存在的方法。
        PrintStream out = System.out;
        Arrays.asList("a", "b", "c").forEach(out::println);
    }
}
