package com.rc.dp.pattern.create.prototype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName TestSpringBeanScope
 * @Description TODO
 * @Author liux
 * @Date 19-11-22 下午6:10
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@ContextConfiguration({"/spring-bean.xml"})
public class TestSpringBeanScope {

//    @Autowired
//    ApplicationContext applicationContext;

    @Test
    public void test() {
//        Student student = applicationContext.getBean(Student.class);
//        Student student2 = applicationContext.getBean(Student.class);

        Student student = new Student();
        Student student2 = new Student();
        System.out.println("student: " + student.hashCode() + "\t" + student.getFriend().hashCode());
        System.out.println("student2: " + student2.hashCode() + "\t" + student2.getFriend().hashCode());
    }

}
