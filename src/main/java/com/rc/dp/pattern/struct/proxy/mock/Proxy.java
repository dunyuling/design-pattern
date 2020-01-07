package com.rc.dp.pattern.struct.proxy.mock;

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
 * @ClassName Proxy
 * @Description
 * @Author liux
 * @Date 19-12-23 下午10:33
 * @Version 1.0
 */
public class Proxy {

    public static Object newProxyInstance(Class intface, InvocationHandler handler) {

        String rt = "\r\n";
        String methodStr = "";
        Method[] methods = intface.getMethods();
        for (Method method : methods) {


            methodStr += "    @Override" + rt +
                    "    public " + method.getReturnType() + " " + method.getName() + "() {" + rt +
                    "        try {" + rt +
                    "            Method md = " + intface.getName() + ".class.getMethod(\"" + method.getName() + "\");" + rt +
                    "            handler.invoke(md,this);" + rt +
                    "        } catch(Exception e) {" + rt +
                    "            e.printStackTrace();" + rt +
                    "        }" + rt +
                    "    }" + rt;
        }

        String src =
                "package com.rc.dp.pattern.struct.proxy.mock;" + rt +
                        "import java.lang.reflect.Method;" + rt +
                        "public class TankTimeProxy implements " + intface.getName() + " {" + rt +
                        "    private com.rc.dp.pattern.struct.proxy.mock.InvocationHandler handler;" + rt +
                        "    public TankTimeProxy(InvocationHandler handler) {" + rt +
                        "        this.handler = handler;" + rt +
                        "    }" + rt +

                        methodStr + rt +
                        "}" + rt;

        String fileName = System.getProperty("user.dir");
        fileName += "/src/main/java/com/rc/dp/pattern/struct/proxy/mock/TankTimeProxy.java";

        try {
            //create java file
            File file = new File(fileName);
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

            Constructor constructor = aClass.getConstructor(InvocationHandler.class);
            Object movable = constructor.newInstance(handler);

            return movable;
        } catch (IOException | ClassNotFoundException | NoSuchMethodException |
                InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}