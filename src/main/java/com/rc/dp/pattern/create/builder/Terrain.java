package com.rc.dp.pattern.create.builder;

/**
 * @ClassName Terrain
 * @Description 抽取坦克游戏中的部分来做本案例
 * @Author liux
 * @Date 19-11-25 上午12:05
 * @Version 1.0
 */
public class Terrain {//地形
    Wall w;
    Fort f;
    Mine m;
}

class Wall {//墙
    int x, y, w, h;

    public Wall(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}

class Fort {//堡垒
    int x, y, w, h;

    public Fort(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

}

class Mine {//地雷
    int x, y, w, h;

    public Mine(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}