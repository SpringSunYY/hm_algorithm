package cn.yy.algorithm.test;

import cn.itcast.algorithm.sort.Student;

import static cn.itcast.algorithm.test.TestComparable.getMax;

/**
 * @Project: algorithm
 * @Package: cn.yy.algorithm.test
 * @Author: YY
 * @CreateTime: 2024-08-12  10:28
 * @Description: TestComparable
 * @Version: 1.0
 */
public class TestComparable {
    public static void main(String[] args) {
        //创建两个Student对象，并调用getMax方法，完成测试
        Student s1 = new Student();
        s1.setUsername("张三");
        s1.setAge(18);

        Student s2 = new Student();
        s2.setUsername("李四");
        s2.setAge(20);

        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }
}
