package com.rc.dp.pattern.behaivor.state.impr;

/**
 * @ClassName NoRaffleState
 * @Description '不能抽奖'状态
 * @Author liux
 * @Date 20-1-16 下午11:48
 * @Version 1.0
 */
public class NoRaffleState implements State {

    //初始化时传入活动状态,扣除积分后改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态可以扣除积分,扣除后,将状态设置成'可以抽奖'状态
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功,您可以抽奖啦");
        activity.setState(activity.getCanRaffleState());
    }

    //当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖哦");
        return false;
    }

    //当前状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
