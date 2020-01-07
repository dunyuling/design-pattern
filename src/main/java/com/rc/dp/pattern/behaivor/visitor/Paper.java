package com.rc.dp.pattern.behaivor.visitor;

/**
 * @ClassName Paper
 * @Description 具体元素：纸
 * @Author liux
 * @Date 20-1-3 下午12:00
 * @Version 1.0
 */
public class Paper implements Material {
    public String accept(Company visitor) {
        return (visitor.create(this));
    }
}
