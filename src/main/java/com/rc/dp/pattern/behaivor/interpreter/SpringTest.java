package com.rc.dp.pattern.behaivor.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @ClassName SpringTest
 * @Description Spring 中 解释器模式的应用示例
 * @Author liux
 * @Date 20-1-15 下午2:48
 * @Version 1.0
 */
public class SpringTest {

    public static void main(String[] args) {
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        Expression expression = spelExpressionParser.parseExpression("10*(1+2)*1+3");
        Object value = expression.getValue();
        System.out.println(value);
    }
}
