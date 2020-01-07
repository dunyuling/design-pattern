package com.rc.dp.pattern.struct.proxy.mock.compiler.test;

import com.rc.dp.pattern.struct.proxy.mock.Movable;
import com.rc.dp.pattern.struct.proxy.mock.Tank;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @ClassName Test1
 * @Description 文本->java文件->class文件->load class into memory->run
 * @Author liux
 * @Date 19-12-24 上午10:14
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        String rt = "\r\n";
        String src =
                "package com.rc.dp.pattern.struct.proxy.mock;" + rt +

                        "public class TankTimeProxy implements Movable {" + rt +

                        "   private Movable movable;" + rt +

                        "   public TankTimeProxy(Movable movable) {" + rt +
                        "       this.movable = movable;" + rt +
                        "   }" + rt +

                        "   @Override" + rt +
                        "   public void move() {" + rt +
                        "      long start = System.currentTimeMillis();" + rt +
                        "       System.out.println(\"start time: \" + start);" + rt +
                        "       movable.move();" + rt +
                        "       long end = System.currentTimeMillis();" + rt +
                        "       System.out.println(\"move time: \" + (end - start));" + rt +
                        "   }" + rt +
                        "}" + rt;

        String fileName = System.getProperty("user.dir");
        fileName += "/src/main/java/com/rc/dp/pattern/struct/proxy/mock/TankTimeProxy.java";

        try {
            //create java file
            FileWriter fw = new FileWriter(new File(fileName));
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
            System.out.println("aClass: " + aClass);

            Constructor constructor = aClass.getConstructor(Movable.class);
            Movable movable = (Movable) constructor.newInstance(new Tank());
            movable.move();
        } catch (IOException | ClassNotFoundException | NoSuchMethodException |
                InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}