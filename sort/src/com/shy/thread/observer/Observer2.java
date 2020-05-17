package com.shy.thread.observer;

/**
 * @author 石皓岩
 * @create 2020-04-11 14:17
 * 描述：
 */
public class Observer2 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("2 接受到改变"+msg);
    }
}
