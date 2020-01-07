package com.rc.dp.pattern.behaivor.visitor;

/**
 * @ClassName Company
 * @Description 抽象访问者:公司
 * @Author liux
 * @Date 20-1-3 上午11:58
 * @Version 1.0
 */
public interface Company {
    String create(Paper element);
    String create(Cuprum element);
}
