package com.rc.dp.pattern.behaivor.template;

/**
 * @ClassName PureSoyMilk
 * @Description TODO
 * @Author liux
 * @Date 19-12-26 上午9:57
 * @Version 1.0
 */
public class PureSoyMilk extends SoyMilk {

    @Override
    void addCondiment() {
    }

    @Override
    boolean needCondiment() {
        return false;
    }
}
