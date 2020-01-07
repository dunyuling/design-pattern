package com.rc.dp.pattern.struct.facade;

/**
 * @ClassName HomeTheaterFacade
 * @Description 家庭影院外观类
 * @Author liux
 * @Date 19-12-14 下午5:13
 * @Version 1.0
 */
public class HomeTheaterFacade {

    //定义子系统对象
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        dvdPlayer = DVDPlayer.getInstance();
        popcorn = Popcorn.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
        stereo = Stereo.getInstance();
        theaterLight = TheaterLight.getInstance();
    }

    //操作分成四步
    public void ready() {
        popcorn.on();//打开爆米花机器
        popcorn.pop();//得到爆米花
        screen.down();//放下屏幕
        projector.on();//打开投影仪
        projector.focus();//投影仪聚焦
        stereo.on();//打开立体声
        dvdPlayer.on();//打开dvd
        theaterLight.dim();//调暗灯光
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
