package com.rc.dp.pattern.struct.adapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Main
 * @Description InputStreamReader 相当于 FileInputStream 和BufferReader 之间的adapter
 * @Author liux
 * @Date 19-11-25 下午10:21
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        /*FileInputStream fis = new FileInputStream("c:/test.text");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
        br.close();*/


       /* ArrayList<Integer> array = new ArrayList<>();
        Integer[] integers = new Integer[array.size()];
        array.toArray(integers);*/

       List<Student> students = new ArrayList<>();
       students.add(new Student(1,"lhg"));
       students.add(new Student(2,"zx"));
        System.out.println(students);

    }

}
