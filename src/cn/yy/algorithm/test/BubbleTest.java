package cn.yy.algorithm.test;

import cn.itcast.algorithm.sort.Bubble;

import java.util.Arrays;

/**
 * @Project: algorithm
 * @Package: cn.yy.algorithm.test
 * @Author: YY
 * @CreateTime: 2024-08-13  20:23
 * @Description: BubbleTest
 * @Version: 1.0
 */
public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4,5,6,3,2,1};
        Bubble.sort(arr);

        System.out.println(Arrays.toString(arr));//{1,2,3,4,5,6}
    }
}
