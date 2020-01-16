package com.rc.dp.pattern.behaivor.interpreter;

import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

/**
 * @ClassName JepTest
 * @Description Jep 中 解释器模式的应用示例
 * @Author liux
 * @Date 20-1-14 下午5:47
 * @Version 1.0
 */
public class JepTest {

    public static void main(String[] args) throws ParseException {
        JEP jep = new JEP();
        //定义要计算的数据表达式
        String 存款利息 = "本金*利率*时间";
        //给相关变量赋值
        jep.addVariable("本金", 10000);
        jep.addVariable("利率", 0.038);
        jep.addVariable("时间", 2);
        Node node = jep.parse(存款利息);    //解析表达式
        Object accrual = jep.evaluate(node);  //计算
        System.out.println("存款利息：" + accrual);
    }
}
