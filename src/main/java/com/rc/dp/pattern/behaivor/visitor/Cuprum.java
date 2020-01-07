package com.rc.dp.pattern.behaivor.visitor;

/**
 * @ClassName Cuprum
 * @Description 具体元素：铜
 * @Author liux
 * @Date 20-1-3 下午12:00
 * @Version 1.0
 */
public class Cuprum implements Material {
    public String accept(Company visitor) {
        return (visitor.create(this));
    }
}
