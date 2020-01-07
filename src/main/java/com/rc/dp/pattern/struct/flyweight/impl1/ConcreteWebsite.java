package com.rc.dp.pattern.struct.flyweight.impl1;

/**
 * @ClassName ConcreteWebsite
 * @Description 具体网站
 * @Author liux
 * @Date 19-12-15 下午3:29
 * @Version 1.0
 */
public class ConcreteWebsite implements Website {

    //内部状态
    private String type;

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {//user 为外部状态
        System.out.println("当前网站的发布形式为: " + type + " ,用户为: " + user.getName());
    }
}
