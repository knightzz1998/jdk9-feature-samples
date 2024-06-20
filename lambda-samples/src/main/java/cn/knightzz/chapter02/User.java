package cn.knightzz.chapter02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 王天赐
 * @title User
 * @description
 * @create 2024-06-17 08:40
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int age;
}
