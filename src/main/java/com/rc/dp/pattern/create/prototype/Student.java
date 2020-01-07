package com.rc.dp.pattern.create.prototype;

import java.util.Random;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liux
 * @Date 19-11-24 下午12:15
 * @Version 1.0
 */
public class Student implements Cloneable {

    private int id;

    private String name;

    private Student friend;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getFriend() {
        return friend;
    }

    public void setFriend(Student friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
