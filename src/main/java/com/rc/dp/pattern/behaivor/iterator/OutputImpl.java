package com.rc.dp.pattern.behaivor.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ClassName OutputImpl
 * @Description 输出类
 * @Author liux
 * @Date 20-1-5 上午12:56
 * @Version 1.0
 */
public class OutputImpl {

    List<College> colleges = new ArrayList<>();

    public OutputImpl() {
        this.colleges.add(new ComputerCollege());
        this.colleges.add(new CommunicationCollege());
    }

    public void printCollege() {
        colleges.iterator().forEachRemaining(new Consumer<College>() {
            @Override
            public void accept(College college) {
                System.out.println("=============");
                System.out.println(college.getName());
                System.out.println("-----");
                printDepartment(college.createIterator());
            }
        });
    }

    private void printDepartment(Iterator<Department> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
