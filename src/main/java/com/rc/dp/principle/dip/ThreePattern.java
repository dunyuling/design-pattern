package com.rc.dp.principle.dip;

/**
 * @ClassName ThreePattern
 * @Description 依赖倒置原则的三种实现方式
 * @Author liux
 * @Date 19-11-15 下午6:56
 * @Version 1.0
 */
public class ThreePattern {
    public static void main(String[] args) {
        Hisense hisense = new Hisense();

        //方式1调用
//        IOpenAndClose iOpenAndClose = new OpenAndClose();
//        iOpenAndClose.open(hisense);

        //方式2调用
//        IOpenAndClose iOpenAndClose = new OpenAndClose(hisense);
//        iOpenAndClose.open();

        //方式3调用
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setItv(hisense);
        openAndClose.open();
    }
}


class Hisense implements ITV {

    @Override
    public void play() {
        System.out.println("海信电视已打开");
    }
}


//方式1: 通过接口实现传递依赖
//interface IOpenAndClose {
//    void open(ITV itv);
//}
//
//interface ITV {
//    void play();
//}

//class OpenAndClose implements IOpenAndClose {
//
//    @Override
//    public void open(ITV itv) {
//        itv.play();
//    }
//}


//方式2:通过构造实现依赖传递
//interface IOpenAndClose {
//    void open();
//}
//
//interface ITV {
//    void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//
//    private ITV itv;
//
//    public OpenAndClose(ITV itv) {
//        this.itv = itv;
//    }
//
//    @Override
//    public void open() {
//        itv.play();
//    }
//}

//方式3:通过setter实现依赖传递
interface IOpenAndClose {
    void open();
}

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {

    private ITV itv;

    public void setItv(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        itv.play();
    }
}
