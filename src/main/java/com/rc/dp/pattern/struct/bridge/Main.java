package com.rc.dp.pattern.struct.bridge;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-12-3 下午1:45
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("folded: ");
        Phone huaweiFolded = new FoldedPhone(new Huawei());
        huaweiFolded.open();
        huaweiFolded.call();
        huaweiFolded.close();
        System.out.println("-------------");
        Phone vivoFolded = new FoldedPhone(new Vivo());
        vivoFolded.open();
        vivoFolded.call();
        vivoFolded.close();
        System.out.println("-------------");
        Phone xiaomiFolded = new FoldedPhone(new Xiaomi());
        xiaomiFolded.open();
        xiaomiFolded.call();
        xiaomiFolded.close();

        System.out.println("===============");
        System.out.println("upright: ");
        Phone huaweiUpRight = new UpRightPhone(new Huawei());
        huaweiUpRight.open();
        huaweiUpRight.call();
        huaweiUpRight.close();
        System.out.println("------------");
        Phone vivoUpRight = new UpRightPhone(new Vivo());
        vivoUpRight.open();
        vivoUpRight.call();
        vivoUpRight.close();
        System.out.println("------------");
        Phone XiaomiUpRight = new UpRightPhone(new Xiaomi());
        XiaomiUpRight.open();
        XiaomiUpRight.call();
        XiaomiUpRight.close();


    }
}
