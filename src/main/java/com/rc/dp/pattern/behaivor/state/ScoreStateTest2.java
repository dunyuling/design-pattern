package com.rc.dp.pattern.behaivor.state;

/**
 * @ClassName ScoreStateTest2
 * @Description TODO
 * @Author liux
 * @Date 20-1-16 下午9:17
 * @Version 1.0
 */
public class ScoreStateTest2 {

    public static void main(String[] args) {
        ScoreContext2 scoreContext2 = new ScoreContext2();
        System.out.println("学生成绩状态测试：");
        scoreContext2.add(10);
        scoreContext2.add(50);
        scoreContext2.add(35);
        scoreContext2.add(-20);
        scoreContext2.add(-30);
    }
}

class ScoreContext2 {

    private AbstractState2 state2;

    ScoreContext2() {
        state2 = new LowState2(this);
    }

    public AbstractState2 getState2() {
        return state2;
    }

    public void setState2(AbstractState2 state2) {
        this.state2 = state2;
    }

    public void add(int score) {
        state2.addScore(score);
    }
}

abstract class AbstractState2 {

    protected ScoreContext2 scoreContext2;

    protected String stateName;

    protected int score;

    protected void addScore(int score) {
        this.score += score;
        System.out.print("加上: " + score);
        checkState();
        System.out.println("当前分数为: " + scoreContext2.getState2().score + ", 当前状态: " + scoreContext2.getState2().stateName);
    }

    protected abstract void checkState();
}

class LowState2 extends AbstractState2 {

    LowState2(ScoreContext2 scoreContext2) {
        this.scoreContext2 = scoreContext2;
        this.stateName = "不及格";
        this.score = 0;
    }

    LowState2(AbstractState2 abstractState2) {
        this.scoreContext2 = abstractState2.scoreContext2;
        this.stateName = "不及格";
        this.score = abstractState2.score;
    }

    @Override
    protected void checkState() {
        if (score >= 90) {
            scoreContext2.setState2(new HighState2(this));
        } else if (score >= 60) {
            scoreContext2.setState2(new MidState2(this));
        }
    }
}

class MidState2 extends AbstractState2 {

    MidState2(AbstractState2 abstractState2) {
        this.scoreContext2 = abstractState2.scoreContext2;
        this.stateName = "中等";
        this.score = abstractState2.score;
    }

    @Override
    protected void checkState() {
        if (score < 60) {
            scoreContext2.setState2(new LowState2(this));
        } else if (score >= 90) {
            scoreContext2.setState2(new HighState2(this));
        }
    }
}

class HighState2 extends AbstractState2 {

    HighState2(AbstractState2 abstractState2) {
        this.scoreContext2 = abstractState2.scoreContext2;
        this.stateName = "优秀";
        this.score = abstractState2.score;
    }

    @Override
    protected void checkState() {
        if (score < 60) {
            scoreContext2.setState2(new LowState2(this));
        } else if (score < 90) {
            scoreContext2.setState2(new MidState2(this));
        }
    }
}