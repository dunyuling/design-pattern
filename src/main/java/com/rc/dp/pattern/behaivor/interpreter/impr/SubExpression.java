package com.rc.dp.pattern.behaivor.interpreter.impr;

import java.util.HashMap;

/**
 * @ClassName SubExpression
 * @Description 减法解析器
 * @Author liux
 * @Date 20-1-15 下午12:45
 * @Version 1.0
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /*
     * @Author liux
     * @Description 处理相减,var->{a=10,b=20}
     * @Date 20-1-15 下午12:48
     * @param var
     * @return int
     **/
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        //通过VarExpression获取具体的值
        //super.left.interpreter(var): 返回left表达式对应的值a->10
        //super.right.interpreter(var): 返回left表达式对应的值b->20
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
