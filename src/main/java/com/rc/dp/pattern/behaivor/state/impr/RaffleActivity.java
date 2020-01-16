package com.rc.dp.pattern.behaivor.state.impr;

/**
 * @ClassName RaffleActivity
 * @Description 抽奖活动
 * @Author liux
 * @Date 20-1-16 下午11:49
 * @Version 1.0
 */
public class RaffleActivity {

    //活动当前状态,是变化的
    private State state;
    //奖品数量
    private int count = 0;
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    //扣除积分
    public void deductMoney() {
        state.deductMoney();
    }

    //是否抽中奖品
    public void raffle() {
        if (state.raffle()) {
            //抽奖成功,领取奖品
            state.dispensePrize();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }


    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}