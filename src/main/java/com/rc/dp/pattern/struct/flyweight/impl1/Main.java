package com.rc.dp.pattern.struct.flyweight.impl1;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-12-15 上午12:49
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //享元模式实际应用String
       /* String s = "hello";
        String s2 = new String("hello");
        System.out.println(s == s2);
        System.out.println(s.hashCode() == s2.hashCode());*/

        //享元模式实际应用Integer
        /*Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);

        System.out.println("x.equals(y): " + x.equals(y));//true
        System.out.println("(x == y): " + (x == y));//false
        System.out.println("(x == z): " + (x == z));//true
        System.out.println("(x == w): " + (x == w));//false
        System.out.println("(y == w): " + (y == w));//false
*/

        WebsiteFactory websiteFactory = new WebsiteFactory();

        Website website1 = websiteFactory.getWebsite("news");
        website1.use(new User("zsf"));

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Website website2 = websiteFactory.getWebsite("blog");
                website2.use(new User("hxg"));
                /*try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);
        Thread thread5 = new Thread(runnable);
        Thread thread6 = new Thread(runnable);
        Thread thread7 = new Thread(runnable);
        Thread thread8 = new Thread(runnable);
        Thread thread9 = new Thread(runnable);
        Thread thread10 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();
        thread7.join();
        thread8.join();
        thread9.join();
        thread10.join();


//        Website website3 = websiteFactory.getWebsite("blog");
//        website3.use();
//
//        Website website4 = websiteFactory.getWebsite("blog");
//        website4.use();


        System.out.println(websiteFactory.size());
    }
}
