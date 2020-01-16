package com.rc.dp.pattern.behaivor.interpreter.impr;

import java.util.HashMap;

/**
 * @ClassName VarExpression
 * @Description 变量解析器
 * @Author liux
 * @Date 20-1-15 下午12:32
 * @Version 1.0
 */
public class VarExpression extends Expression {

    private String key;//a,b,c

    public VarExpression(String key) {
        this.key = key;
    }

    //
    /*
     * @Author liux
     * @Description var->{a=10,b=20} ,根据变量名称返回对应的值
     * @Date 20-1-15 下午12:33
     * @param var
     * @return int
     **/
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
