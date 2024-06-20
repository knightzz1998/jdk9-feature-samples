package cn.knightzz.chapter03;

import java.util.function.Consumer;

/**
 * @author 王天赐
 * @title ConsumerDemo
 * @description
 * @create 2024-06-17 15:46
 */
public class ConsumerDemo01 {

    public static void main(String[] args) {
        handler(s -> System.out.println("first " + s), s -> System.out.println("second " + s), "hello world");
    }

    public static void handler(Consumer<String> first, Consumer<String> second, String msg) {
        first.andThen(second).accept(msg);
    }
}
