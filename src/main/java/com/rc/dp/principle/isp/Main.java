package com.rc.dp.principle.isp;

/**
 * @ClassName Main
 * @Description 接口隔离原则（Interface Segregation Principle，ISP）实现 方式1
 *          接口隔离原则主要约束接口，主要针对抽象和程序整体框架的构建
 * @Author liux
 * @Date 19-11-15 下午4:54
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        InputModule input = StuScoreList.getInputModule();
        CountModule count = StuScoreList.getCountModule();
        PrintModule print = StuScoreList.getPrintModule();
        input.insert();
        count.countTotalScore();
        print.printStuInfo();
        //print.delete();
    }
}


//输入模块接口
interface InputModule {
    void insert();

    void delete();

    void modify();
}

//统计模块接口
interface CountModule {
    void countTotalScore();

    void countAverage();
}

//打印模块接口
interface PrintModule {
    void printStuInfo();

    void queryStuInfo();
}

//实现类
class StuScoreList implements InputModule, CountModule, PrintModule {
    private StuScoreList() {
    }

    public static InputModule getInputModule() {
        return new StuScoreList();
    }

    public static CountModule getCountModule() {
        return new StuScoreList();
    }

    public static PrintModule getPrintModule() {
        return new StuScoreList();
    }

    public void insert() {
        System.out.println("输入模块的insert()方法被调用！");
    }

    public void delete() {
        System.out.println("输入模块的delete()方法被调用！");
    }

    public void modify() {
        System.out.println("输入模块的modify()方法被调用！");
    }

    public void countTotalScore() {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }

    public void countAverage() {
        System.out.println("统计模块的countAverage()方法被调用！");
    }

    public void printStuInfo() {
        System.out.println("打印模块的printStuInfo()方法被调用！");
    }

    public void queryStuInfo() {
        System.out.println("打印模块的queryStuInfo()方法被调用！");
    }
}