package cn.knightzz.chapter02;

/**
 * @author 王天赐
 * @title RunnableDemo01
 * @description
 * @create 2024-06-17 15:05
 */
public class RunnableDemo01 {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("hello world");
        };
    }
}
