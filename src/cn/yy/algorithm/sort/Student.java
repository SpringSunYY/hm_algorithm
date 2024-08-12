package cn.yy.algorithm.sort;

/**
 * @Project: algorithm
 * @Package: cn.yy.algorithm.sort
 * @Author: YY
 * @CreateTime: 2024-08-12  10:27
 * @Description: Student
 * @Version: 1.0
 */
public class Student implements Comparable<Student> {
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
