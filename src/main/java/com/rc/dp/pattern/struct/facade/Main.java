package com.rc.dp.pattern.struct.facade;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-12-14 下午5:22
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println();
        homeTheaterFacade.play();
        System.out.println();
        homeTheaterFacade.pause();
        System.out.println();
        homeTheaterFacade.end();
    }
}