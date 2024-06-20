package cn.knightzz.chapter01;

/**
 * @author 王天赐
 * @title MessageProducer
 * @description
 * @create 2024-06-17 15:11
 */
public class MessageProducer implements Producer<String> {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}