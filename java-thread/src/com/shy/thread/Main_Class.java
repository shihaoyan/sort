package com.shy.thread;

/**
 * @author 石皓岩
 * @create 2020-04-24 16:05
 * 描述：io流主类
 */
public class Main_Class {

    public static void main(String[] args) {
    }

    private static void printABC() {
        PrintClass print = new PrintClass();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                print.printA();
            }, "A").start();
            new Thread(() -> {
                print.printB();
            }, "B").start();
            new Thread(() -> {
                print.printC();
            }, "C").start();
        }
    }
}
