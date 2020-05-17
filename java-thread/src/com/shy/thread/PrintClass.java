package com.shy.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 石皓岩
 * @create 2020-05-17 12:24
 * 描述：
 */
public class PrintClass {
    ReentrantLock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();


    private int num = 1;

    public void printA() {
        lock.lock();
        try {
            while (num != 1) {
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "---------A");
            num++;
            condition1.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printB() {
        lock.lock();
        try {
            while (num != 2) {
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "---------B");
            num++;
            condition1.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printC() {
        lock.lock();
        try {
            while (num != 3) {
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "---------C");
            num = 1;
            condition1.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
