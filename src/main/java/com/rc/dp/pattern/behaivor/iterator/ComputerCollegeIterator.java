package com.rc.dp.pattern.behaivor.iterator;

import java.util.Iterator;

/**
 * @ClassName ComputerCollegeIterator
 * @Description 计算机学员迭代器类
 * @Author liux
 * @Date 20-1-5 上午12:36
 * @Version 1.0
 */
public class ComputerCollegeIterator implements Iterator<Department> {

    private Department[] departments;
    private int num = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (num >= departments.length || departments[num] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Department next() {
        Department department = departments[num];
        num++;
        return department;
    }
}
