package com.rc.dp.pattern.behaivor.interpreter.impr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 20-1-15 下午1:06
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String expStr = getExp();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果: " + expStr + "=" + calculator.run(var));
    }

    /*
     * @Author liux
     * @Description 获取表达式
     * @Date 20-1-15 下午1:11
     * @param
     * @return java.lang.String
     **/
    public static String getExp() throws IOException {
        System.out.print("请输入表达式(目前只支持对于Integer类型的+,-操作):");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(ch)) {
                    System.out.print("请输入" + ch + "的值:");
                    String temp = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(temp));
                }
            }
        }
        return map;
    }
}
