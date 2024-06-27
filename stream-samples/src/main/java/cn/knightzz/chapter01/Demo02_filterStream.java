package cn.knightzz.chapter01;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 王天赐
 * @title Demo02_filterStream
 * @description
 * @create 2024-06-20 14:09
 */
public class Demo02_filterStream {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("张三", "发票,费控"),
                new User("李四", "发票,费控,底座"),
                new User("王五", "发票,底座"),
                new User("赵六", "首营,费控")
        );
        Map<String, List<User>> categoryMap = users.stream()
                .flatMap(
                        user -> {
                            // 将每个user的 systemInfoIdsList 变成一个扁平的流
                            return getSystemInfoIdsList(user.getSystemInfoIds())
                                    .stream()
                                    // 为每个类别和用户名创建一个 Map.Entry
                                    .map(category -> new AbstractMap.SimpleEntry<>(category, user));
                        })
                .collect(
                        Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())));

        // 输出结果
        categoryMap.forEach((key, value) -> System.out.println("key = " + key + ", value = " + value));

    }
    public static List<String> getSystemInfoIdsList(String systemInfoIds) {
        return Arrays.asList(systemInfoIds.split(","));
    }
}
