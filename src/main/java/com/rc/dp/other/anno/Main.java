package com.rc.dp.other.anno;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-12-20 上午2:07
 * @Version 1.0
 */
public class Main {

//    @Hello(value = "hello", value2 = "world")
//    public static void main(String[] args) throws NoSuchMethodException {
//        Class cls = Main.class;
//        Method method = cls.getMethod("main", String[].class);
//        Hello hello = method.getAnnotation(Hello.class);
//        System.out.println(hello.value());
//        System.out.println(hello.value2());
//
//    }

    public static void main(String[] args) {
        try {
            Hashtable<String,String> hashTable = new Hashtable<>();
            hashTable.put(null,"abc");
            System.out.println(hashTable.get(null));
        } catch (Exception e) {
            e.printStackTrace();
        }


        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put(null,"abc");
        System.out.println(hashMap.get(null));

        try {
            ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
            concurrentHashMap.put(null,"abc");
            System.out.println(concurrentHashMap.get(null));
        } catch (Exception e) {
            e.printStackTrace();
        }

        

    }
}
