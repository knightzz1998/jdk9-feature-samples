package cn.knightzz.chapter01;

/**
 * @author 王天赐
 * @title Consumer
 * @description
 * @create 2024-06-17 13:56
 */
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}