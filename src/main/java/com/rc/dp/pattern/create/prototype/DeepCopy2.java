package com.rc.dp.pattern.create.prototype;

import java.io.*;

/**
 * @ClassName DeepCopy2
 * @Description 这种方式不仅能解决一个类引用其他类的深拷贝问题(如DeepCopy2引用Teacher)
 * 而且能解决一个类自我引用的深拷贝问题(如Teacher引用Teacher)
 * @Author liux
 * @Date 19-11-22 下午7:01
 * @Version 1.0
 */
public class DeepCopy2 implements Serializable {

    private String name;
    private Teacher teacher;

    public DeepCopy2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "DeepCopy2{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", teacher.friend=" + teacher.getFriend() +
                ", this.hashcode=" + hashCode() +
                ", teacher.hashcode=" + teacher.hashCode() +
                ", teacher.friend.hashcode=" + teacher.getFriend().hashCode() +
                '}';
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Object deepCopy() {
        ObjectOutputStream objectOutputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectInputStream objectInputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;

        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) objectOutputStream.close();
                if (byteArrayOutputStream != null) byteArrayOutputStream.close();
                if (objectInputStream != null) objectInputStream.close();
                if (byteArrayInputStream != null) byteArrayInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopy2 deepCopy2 = new DeepCopy2("d2");
        Teacher teacher = new Teacher(1, "liux");
        teacher.setFriend(new Teacher(2, "张三"));
        deepCopy2.setTeacher(teacher);

        DeepCopy2 deepCopy2_2 = (DeepCopy2) deepCopy2.deepCopy();
        DeepCopy2 deepCopy2_3 = (DeepCopy2) deepCopy2.deepCopy();

        System.out.println("deepCopy2: " + deepCopy2);
        System.out.println("deepCopy2_2: " + deepCopy2_2);
        System.out.println("deepCopy2_3: " + deepCopy2_3);

    }
}

class Teacher implements Serializable {

    private int id;

    private String name;

    private Teacher friend;

    public Teacher(int id, String name) {
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

    public Teacher getFriend() {
        return friend;
    }

    public void setFriend(Teacher friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}