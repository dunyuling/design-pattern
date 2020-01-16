package com.rc.dp.pattern.behaivor.state.impr;

/**
 * @ClassName State
 * @Description 状态接口
 * @Author liux
 * @Date 20-1-16 下午11:42
 * @Version 1.0
 */
public interface State {

    //扣除积分
    public void deductMoney();

    //是否抽中奖品
    public boolean raffle();

    //发放奖品
    public void dispensePrize();

}
