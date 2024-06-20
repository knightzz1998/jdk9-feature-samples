package cn.knightzz.chapter01;

/**
 * @author 王天赐
 * @title Producer
 * @description
 * @create 2024-06-17 13:55
 */
@FunctionalInterface
public interface Producer<T> {

    T getMessage();
}

