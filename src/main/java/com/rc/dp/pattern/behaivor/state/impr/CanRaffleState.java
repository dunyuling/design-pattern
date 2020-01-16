package com.rc.dp.pattern.behaivor.state.impr;

import java.util.Random;

/**
 * @ClassName CanRaffleState
 * @Description '可以抽奖'状态
 * @Author liux
 * @Date 20-1-16 下午11:54
 * @Version 1.0
 */
public class CanRaffleState implements State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //已经扣除了积分,不能再扣了
    @Override
    public void deductMoney() {
        System.out.println("已经扣取过了积分");
    }

    //可以抽奖,抽完奖后,根据实际情况,改变成新的状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖,请稍等!");
        Random random = new Random();
        int num = random.nextInt(10);
        if (num == 0) {
            //改变状态为'发放奖品'
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品!");
            //改变状态为'不能抽奖'
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    //不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("没中奖,不能发放奖品");
    }
}
