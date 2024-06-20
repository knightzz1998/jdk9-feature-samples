package cn.knightzz.chapter05;

import java.util.function.Function;

/**
 * @author 王天赐
 * @title FunctionDemo01
 * @description
 * @create 2024-06-19 08:42
 */
public class FunctionDemo01 {

    public static void main(String[] args) {
        String result = handler(num -> {
            return "result : " + String.valueOf(num + 1);
        }, 999);
        System.out.println(result);
    }

    /**
     * 数据处理
     * @param function 具体的数据处理函数 Function<入参, 出参>
     * @param num 数据
     * @return 处理后的结果
     */
    public static String handler(Function<Integer, String> function, int num) {
        return function.apply(num);
    }
}


