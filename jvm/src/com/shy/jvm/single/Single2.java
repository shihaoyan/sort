package com.shy.jvm.single;

/**
 * @author 石皓岩
 * @create 2020-04-11 12:55
 * 描述：懒汉式
 */
public class Single2 {

    private static Single2 single2 = null;

    private Single2() {
    }

    public synchronized static Single2 getSingle2(){
        if(single2 == null){
            return single2 = new Single2();
        }
        return single2;
    }



}
