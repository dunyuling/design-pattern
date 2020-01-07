package com.rc.dp.pattern.behaivor.iterator;

import java.util.Iterator;

/**
 * @ClassName ComputerCollege
 * @Description 计算机学院
 * @Author liux
 * @Date 20-1-5 上午12:43
 * @Version 1.0
 */
public class ComputerCollege implements College {

    private Department[] departments;
    private int num = 0;

    public ComputerCollege() {
        this.departments = new Department[4];
        addDepartment("信息管理");
        addDepartment("软件");
        addDepartment("测控");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name) {
        departments[num] = new Department(name);
        num++;
    }

    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}