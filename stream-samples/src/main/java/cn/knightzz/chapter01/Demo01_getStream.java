package cn.knightzz.chapter01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 王天赐
 * @title StreamDemo01
 * @description
 * @create 2024-06-20 11:07
 */
public class Demo01_getStream {

    public static void main(String[] args) {

        List<String> sourceList = Arrays.asList("张三丰", "张无忌", "张翠山", "张良", "张三丰", "张无忌", "张翠山",
                "张良", "赵敏", "周芷若", "周芷若", "周芷若", "周芷若");
        // 1. 查找姓张的人
        // 2. 查找名字2个字的人
        // 3. 打印
        List<String> result = sourceList.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 2)
                .distinct()
                .collect(Collectors.toList());


    }


}
