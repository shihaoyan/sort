package com.shy.jvm.subject;

import com.shy.jvm.observer.Observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author 石皓岩
 * @create 2020-04-11 14:21
 * 描述：
 */
public class Subjectable implements Subject {
    List<Observer> list = new CopyOnWriteArrayList<>();
    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void updateAll(String msg) {
        for (Observer observer : list) {
            observer.update(msg);
        }
    }
}
