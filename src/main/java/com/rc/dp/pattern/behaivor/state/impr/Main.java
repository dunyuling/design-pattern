package com.rc.dp.pattern.behaivor.state.impr;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 20-1-17 上午12:23
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(2);

        for (int i = 0; i < 30; i++) {
            System.out.println("----第" + (i + 1) + "次抽奖-----");
            //参加抽奖,第一步扣除积分
            activity.deductMoney();

            //第二步抽奖
            activity.raffle();
        }
    }
}
