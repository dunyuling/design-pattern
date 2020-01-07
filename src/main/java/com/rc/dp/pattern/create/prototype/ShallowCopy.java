package com.rc.dp.pattern.create.prototype;

/**
 * @ClassName ShallowCopy
 * @Description TODO
 * @Author liux
 * @Date 19-11-22 下午6:00
 * @Version 1.0
 */
public class ShallowCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student(1, "liux");
        student.setFriend(new Student(2, "hj"));

        Student student2 = (Student) student.clone();
        Student student3 = (Student) student.clone();

        System.out.println("student: " + student.hashCode() + "\t friend: " + student.getFriend().hashCode());
        System.out.println("student2: " + student2.hashCode() + "\t friend: " + student2.getFriend().hashCode());
        System.out.println("student3: " + student3.hashCode() + "\t friend: " + student3.getFriend().hashCode());
    }
}