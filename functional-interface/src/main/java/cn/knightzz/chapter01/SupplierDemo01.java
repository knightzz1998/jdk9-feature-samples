package cn.knightzz.chapter01;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;

/**
 * @author 王天赐
 * @title SupplierDemo01
 * @description
 * @create 2024-06-17 13:49
 */
@Slf4j
public class SupplierDemo01 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        });
        log.info("maxValue:{}", maxValue);
    }

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}





