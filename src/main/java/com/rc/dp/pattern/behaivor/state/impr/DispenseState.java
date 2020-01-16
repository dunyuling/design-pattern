package com.rc.dp.pattern.behaivor.state.impr;

/**
 * @ClassName DispenseState
 * @Description '发放奖品'状态
 * @Author liux
 * @Date 20-1-17 上午12:05
 * @Version 1.0
 */
public class DispenseState implements State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    //发放奖品
    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖了");
            //改变状态为'不能抽奖'
            activity.setState(activity.getNoRaffleState());
            activity.setCount(activity.getCount() - 1);
            //没有奖品即退出抽奖活动
            if (activity.getCount() == 0) {
                System.exit(0);
            }
        } else {
            System.out.println("很遗憾,奖品发送完了");
            //改变状态为'奖品领完'
            activity.setState(activity.getDispenseOutState());
            System.exit(0);
        }

    }
}
