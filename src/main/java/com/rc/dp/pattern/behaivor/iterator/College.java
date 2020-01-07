package com.rc.dp.pattern.behaivor.iterator;

import java.util.Iterator;

/**
 * @ClassName College
 * @Description 学院接口
 * @Author liux
 * @Date 20-1-5 上午12:42
 * @Version 1.0
 */
public interface College {

    public String getName();

    public void addDepartment(String name);

    public Iterator<Department> createIterator();
}
