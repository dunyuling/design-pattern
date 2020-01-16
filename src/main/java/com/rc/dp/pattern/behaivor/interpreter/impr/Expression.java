package com.rc.dp.pattern.behaivor.interpreter.impr;

import java.util.HashMap;

/**
 * @ClassName Expression
 * @Description 抽象类表达式, 通过HashaMap 键值对 获取到各个变量的值
 * @Author liux
 * @Date 20-1-15 下午12:28
 * @Version 1.0
 */
public abstract class Expression {

    //a+b+c
    //解释公式和数值,key->公式(表达式)参数[a,b,c], value->具体的值
    //HashMap {a=10,b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
