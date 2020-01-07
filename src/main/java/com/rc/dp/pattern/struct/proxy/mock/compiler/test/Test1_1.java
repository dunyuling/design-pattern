package com.rc.dp.pattern.struct.proxy.mock.compiler.test;

import com.rc.dp.pattern.struct.proxy.mock.Animal;
import com.rc.dp.pattern.struct.proxy.mock.Movable;
import com.rc.dp.pattern.struct.proxy.mock.Pig;
import com.rc.dp.pattern.struct.proxy.mock.Tank;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @ClassName Test1
 * @Description 文本->java文件->class文件->load class into memory->run
 * 可以动态指定接口,并且生成接口的方法
 * @Author liux
 * @Date 19-12-24 上午10:14
 * @Version 1.0
 */
public class Test1_1 {
    public static void main(String[] args) {
        Class intface = Animal.class;
        String rt = "\r\n";
        String methodStr = "";
        Method[] methods = intface.getMethods();
        for (Method method : methods) {
            method.getName();
            methodStr += "    @Override" + rt +
                    "    public " + method.getReturnType() + " " + method.getName() + "() {" + rt +
                    "        long start = System.currentTimeMillis();" + rt +
                    "        System.out.println(\"start time: \" + start);" + rt +
                    "        movable." + method.getName() + "();" + rt +
                    "        long end = System.currentTimeMillis();" + rt +
                    "        System.out.println(\"use time: \" + (end - start));" + rt +
                    "    }";
        }

        String interfaceName = intface.getName();

        String src =
                "package com.rc.dp.pattern.struct.proxy.mock;" + rt +

                        "public class TankTimeProxy implements " + interfaceName + " {" + rt +

                        "    private " + interfaceName + " movable;" + rt +

                        "    public TankTimeProxy(" + interfaceName + " movable) {" + rt +
                        "        this.movable = movable;" + rt +
                        "    }" + rt +

                        methodStr + rt +
                        "}" + rt;

        String fileName = System.getProperty("user.dir");
        fileName += "/src/main/java/com/rc/dp/pattern/struct/proxy/mock/TankTimeProxy.java";

        try {
            //create java file
            File file = new File(fileName);
            if (file.exists()) {
                file.delete();
            }
            FileWriter fw = new FileWriter(file);
            fw.write(src);
            fw.flush();
            fw.close();

            //compile create class file
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
            Iterable units = fileManager.getJavaFileObjects(fileName);
            JavaCompiler.CompilationTask compilationTask = compiler.getTask(null, fileManager, null, null, null, units);
            compilationTask.call();
            fileManager.close();

            //load into memory and create an instance
            URL[] urls = new URL[]{new URL("file://" + System.getProperty("user.dir") + "/src/")};
            URLClassLoader urlClassLoader = new URLClassLoader(urls);
            Class aClass = urlClassLoader.loadClass("com.rc.dp.pattern.struct.proxy.mock.TankTimeProxy");
//            System.out.println(aClass);

            Constructor constructor = aClass.getConstructor(intface);
            Object movable = constructor.newInstance(new Pig());

            ((Animal)movable).walk();
        } catch (IOException | ClassNotFoundException | NoSuchMethodException |
                InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}