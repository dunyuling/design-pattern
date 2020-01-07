package com.rc.dp.pattern.behaivor.template;

/**
 * @ClassName SoyMilk
 * @Description 豆浆抽象类
 * @Author liux
 * @Date 19-12-26 上午9:40
 * @Version 1.0
 */
public abstract class SoyMilk {

    //模板方法 make
    final void make() {
        select();
        if (needCondiment()) {
            addCondiment();
        }
        soak();
        beat();
    }

    //选材
    void select() {
        System.out.println("选取好的新鲜黄豆");
    }

    //添加不同配料,抽象方法,子类具体实现
    abstract void addCondiment();

    //浸泡
    void soak() {
        System.out.println("黄豆和配料开始浸泡,需要3小时");
    }

    //打豆浆
    void beat() {
        System.out.println("黄豆和配料放到豆浆机去打碎");
    }

    //钩子方法
    boolean needCondiment() {
        return true;
    }
}
