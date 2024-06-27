package cn.knightzz.chapter01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author 王天赐
 * @title Demo03_optional
 * @description
 * @create 2024-06-27 15:52
 */
public class Demo03_optional {

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        list.add(new User("张三", "1"));
        list.add(new User("李四", "2"));
        list.add(new User("王五", "3"));
        list.add(new User("赵六", "4"));
        list.add(new User("孙七", "5"));
        list.add(new User("周八", "6"));
        Optional<String> first = list.stream()
                .filter(user -> user.getSystemInfoIds().equals("1"))
                .map(user -> user.getName())
                .findFirst();
        if (first.isPresent()) {
            System.out.println(first.get());
        }else {
            System.out.println("没有找到");
        }
    }
}
