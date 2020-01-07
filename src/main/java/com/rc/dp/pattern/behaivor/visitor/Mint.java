package com.rc.dp.pattern.behaivor.visitor;

/**
 * @ClassName Mint
 * @Description 具体访问者：造币公司
 * @Author liux
 * @Date 20-1-3 上午11:59
 * @Version 1.0
 */
public class Mint implements Company {
    public String create(Paper element) {
        return "纸币";
    }

    public String create(Cuprum element) {
        return "铜币";
    }
}
