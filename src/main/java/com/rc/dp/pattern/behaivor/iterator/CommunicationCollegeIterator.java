package com.rc.dp.pattern.behaivor.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName CommunicationCollegeIterator
 * @Description 通信学院迭代器类
 * @Author liux
 * @Date 20-1-5 上午12:40
 * @Version 1.0
 */
public class CommunicationCollegeIterator implements Iterator<Department> {

    private List<Department> departmentList;
    private int index = 0;

    public CommunicationCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        return index <= departmentList.size() - 1;
    }

    @Override
    public Department next() {
        Department department = departmentList.get(index);
        index++;
        return department;
    }
}
