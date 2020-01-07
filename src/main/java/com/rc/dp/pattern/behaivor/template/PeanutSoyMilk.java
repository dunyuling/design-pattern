package com.rc.dp.pattern.behaivor.template;

/**
 * @ClassName PeanutSoyMilk
 * @Description 花生豆浆
 * @Author liux
 * @Date 19-12-26 上午9:47
 * @Version 1.0
 */
public class PeanutSoyMilk extends SoyMilk {

    @Override
    void addCondiment() {
        System.out.println("添加花生配料");
    }

}
