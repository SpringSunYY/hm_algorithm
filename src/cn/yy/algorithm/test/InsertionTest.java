package cn.yy.algorithm.test;

import cn.itcast.algorithm.sort.Insertion;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a = {11,15,326,4323,2432,43210,35243212,1,5,6,3,2,10,12,1,5,6,3,2,10,12,1,5,6,3,2,10,12,1,5,6,3,2,10,12,1,5,6,3,2,10,12,1,5,6,3,2,10,12,1,5,6,3,2};
        Insertion.sort(a);

        System.out.println(Arrays.toString(a));//{1,2,3,4,5,6,10,12}

    }
}
