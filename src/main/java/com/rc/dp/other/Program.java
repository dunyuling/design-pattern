package com.rc.dp.other;

import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1.other;

/**
 * @ClassName Program
 * @Description TODO
 * @Author liux
 * @Date 20-1-5 下午10:35
 * @Version 1.0
 */
public class Program {
    public static void main(String[] args) {
        /*// Create three strings in three different ways.
        String s1 = "Hello";
        String s2 = new StringBuffer("He").append("llo").toString();
        String s3 = s2.intern();

        // Determine which strings are equivalent using the ==
        // operator
        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 == s3? " + (s1 == s3));*/

//        String hello = "Hello", lo = "lo";
//        System.out.print((hello == "Hello") + " ");
//        System.out.print((Other.hello == hello) + " ");
//        System.out.print((com.rc.dp.another.Other.hello == hello) + " ");
//        System.out.print((hello == ("Hel" + "lo")) + " ");
//        System.out.print((hello == ("Hel" + lo)) + " ");
//        System.out.println(hello == ("Hel" + lo).intern());

//        System.out.println("Hel" + lo);
//        System.out.println();

        String s1 = new String("abs");
        String s2 = "a";
        String s = s1 + s2;
        System.out.println(s.intern());
        System.out.println();
        String s3 = "abs";
        System.out.println(s3.intern() == s1.intern());

    }
}

class Other {
    static String hello = "Hello";
}