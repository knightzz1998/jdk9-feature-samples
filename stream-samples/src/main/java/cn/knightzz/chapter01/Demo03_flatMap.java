package cn.knightzz.chapter01;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 王天赐
 * @title Demo03_flatMap
 * @description
 * @create 2024-06-20 14:32
 */
@Slf4j
public class Demo03_flatMap {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("张三", "发票,费控"),
                new User("李四", "发票,费控,底座"),
                new User("王五", "发票,底座"),
                new User("赵六", "首营,费控")
        );

        Map<String, List<String>> categoryMap = users.stream()
                .flatMap(
                        user -> {
                            // 将每个user的 systemInfoIdsList 变成一个扁平的流
                            return getSystemInfoIdsList(user.getSystemInfoIds())
                                    .stream()
                                    // 为每个类别和用户名创建一个 Map.Entry , SimpleEntry 只有一个键值对 , HashMap可以有多个
                                    .map(category -> new AbstractMap.SimpleEntry<>(category, user.getName()));
                        })
                .collect(
                        Collectors.groupingBy(entry -> entry.getKey(), Collectors.mapping(entry -> entry.getValue(), Collectors.toList())));
        categoryMap.forEach((key, value) -> System.out.println("key = " + key + ", value = " + value));

        List<AbstractMap.SimpleEntry<String, String>> collect = users.stream()
                .flatMap(
                        user -> {
                            // 将每个user的 systemInfoIdsList 变成一个扁平的流
                            return getSystemInfoIdsList(user.getSystemInfoIds())
                                    .stream()
                                    // 为每个类别和用户名创建一个 Map.Entry , SimpleEntry 只有一个键值对 , HashMap可以有多个
                                    .map(category -> new AbstractMap.SimpleEntry<>(category, user.getName()));
                        })
                .collect(Collectors.toList());
        collect.forEach(entry -> System.out.println("entry = " + entry));

    }

    public static List<String> getSystemInfoIdsList(String systemInfoIds) {
        return Arrays.asList(systemInfoIds.split(","));
    }
}
