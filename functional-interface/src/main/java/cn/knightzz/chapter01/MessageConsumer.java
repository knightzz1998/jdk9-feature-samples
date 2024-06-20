package cn.knightzz.chapter01;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王天赐
 * @title MessageConsumer
 * @description
 * @create 2024-06-17 15:11
 */
@Slf4j
public class MessageConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        log.info("MessageConsumer accept: {}", s);
    }
}