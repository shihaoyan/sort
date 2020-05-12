package com.shy.io.subject;

import com.shy.io.observer.Observer;

/**
 * @author 石皓岩
 * @create 2020-04-11 14:19
 * 描述：
 */
public interface Subject {

    void register(Observer observer);

    void remove(Observer observer);

    void updateAll(String msg);



}
