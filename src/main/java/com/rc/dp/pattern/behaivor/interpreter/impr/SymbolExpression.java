package com.rc.dp.pattern.behaivor.interpreter.impr;

import java.util.HashMap;

/**
 * @ClassName SymbolExpression
 * @Description 抽象运算符号解析器, 每个运算符都只和自己左右两个数字有关系
 * 但左右两个数字有可能也是一个解析结果,无论何种类型,都是Expression类的具体实现类
 * @Author liux
 * @Date 20-1-15 下午12:35
 * @Version 1.0
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /*
     * @Author liux
     * @Description 由具体子类来实现该方法
     * @Date 20-1-15 下午12:38
     * @param var
     * @return int
     **/
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
