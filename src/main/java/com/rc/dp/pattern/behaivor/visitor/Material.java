package com.rc.dp.pattern.behaivor.visitor;

/**
 * @ClassName Material
 * @Description 抽象元素：材料
 * @Author liux
 * @Date 20-1-3 上午11:59
 * @Version 1.0
 */
public interface Material {
    String accept(Company visitor);
}
