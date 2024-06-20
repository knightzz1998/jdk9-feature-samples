package cn.knightzz.chapter02;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王天赐
 * @title Demo01
 * @description
 * @create 2024-06-17 14:49
 */
@Slf4j
public class Demo01 {

    public static void main(String[] args) {
        UserFactory factory = (name, age) -> {
            return new User(name, age);
        };
        User user = factory.getUser("张三", 18);
        log.info("user: {}", user);
    }
}
