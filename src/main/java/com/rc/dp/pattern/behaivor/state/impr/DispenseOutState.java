package com.rc.dp.pattern.behaivor.state.impr;

/**
 * @ClassName DispenseOutState
 * @Description '奖品领完'状态
 *  当我们activity 改变成 DispenseOutState, 抽奖活动结束
 * @Author liux
 * @Date 20-1-17 上午12:09
 * @Version 1.0
 */
public class DispenseOutState implements State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了,请参加下次抽奖");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了,请参加下次抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了,请参加下次抽奖");
    }
}
