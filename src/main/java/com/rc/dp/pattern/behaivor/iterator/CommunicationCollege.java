package com.rc.dp.pattern.behaivor.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName CommunicationCollege
 * @Description 通信工程学院
 * @Author liux
 * @Date 20-1-5 上午12:45
 * @Version 1.0
 */
public class CommunicationCollege implements College {

    private List<Department> departments;
    private int num = 0;

    public CommunicationCollege() {
        this.departments = new ArrayList<>();
        addDepartment("通信技术");
        addDepartment("计算机通信");
        addDepartment("通信系统运行管理");
        addDepartment("通信线路");

    }

    @Override
    public String getName() {
        return "通信工程学院";
    }

    @Override
    public void addDepartment(String name) {
        departments.add(new Department(name));
    }

    @Override
    public Iterator<Department> createIterator() {
        return new CommunicationCollegeIterator(departments);
    }
}