package com.rc.dp.pattern.struct.bridge;

/**
 * @ClassName Brand
 * @Description 手机品牌接口
 * @Author liux
 * @Date 19-12-3 下午1:45
 * @Version 1.0
 */
public interface Brand {

    //开机
    void open();

    //关机
    void close();

    //打电话
    void call();
}
