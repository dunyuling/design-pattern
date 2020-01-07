package com.rc.dp.pattern.struct.flyweight.impl1;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName WebsiteFactory
 * @Description 网站工厂类
 * @Author liux
 * @Date 19-12-15 下午3:30
 * @Version 1.0
 */
public class WebsiteFactory {

    private ConcurrentHashMap<String, Website> concurrentHashMap = new ConcurrentHashMap<>();

    public Website getWebsite(String type) {
        if (concurrentHashMap.get(type) == null) {
            concurrentHashMap.put(type, new ConcreteWebsite(type));
        }
        return concurrentHashMap.get(type);
    }

    public int size() {
        return concurrentHashMap.size();
    }
}
