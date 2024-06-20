package cn.knightzz.chapter02;


/**
 * @author 王天赐
 * @title UserFactory
 * @description
 * @create 2024-06-17 08:50
 */
public interface UserFactory {

    User getUser(String name, Integer age);
}
