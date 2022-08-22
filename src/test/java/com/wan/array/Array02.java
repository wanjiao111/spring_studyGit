package com.wan.array;

public class Array02 {
    public static void main(String[] args) {
        //静态初始化：创建，赋值
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(nums[1]);
        //动态初始化：包含默认初始化
        int[] b = new int[10];
        b[0] = 10;
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
