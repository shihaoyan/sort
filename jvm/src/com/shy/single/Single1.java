package com.shy.single;

/**
 * @author 石皓岩
 * @create 2020-04-11 12:54
 * 描述：饿汉式
 */
public class Single1 {

    private static Single1 single1 = new Single1();

    private Single1() {
    }

    public Single1 getSingle1() {
        return single1;
    }


}
