package com.rc.dp.pattern.struct.proxy.mock;

import java.lang.reflect.Method;

/**
 * @ClassName InvocationHandler
 * @Description TODO
 * @Author liux
 * @Date 19-12-24 下午2:31
 * @Version 1.0
 */
public interface InvocationHandler {

    void invoke(Method method,Object obj);

}
