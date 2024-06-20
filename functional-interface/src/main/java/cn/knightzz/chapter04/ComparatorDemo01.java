package cn.knightzz.chapter04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 王天赐
 * @title ComparatorDemo01
 * @description 比较器
 * @create 2024-06-17 15:59
 */
public class ComparatorDemo01 {
    public static void main(String[] args) {

        Comparator cp1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 如果第一个字符串长度 > 第二个字符串长度
                // 就让第一个字符串排在前面
                return o1 - o2;
            }
        };
        Integer[] arr = {1, 12, 23, 4, 35, 64, 17, 8, 29, 110};
        Arrays.sort(arr, cp1);
        Arrays.sort(arr, ((o1, o2) -> o1 - o2));
        Arrays.asList(arr).forEach(System.out::println);
    }
}

