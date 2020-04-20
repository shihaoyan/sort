package com.shy.single;

/**
 * @author 石皓岩
 * @create 2020-04-11 12:59
 * 描述：
 */
public class Single4 {
    private volatile static Single4 single4;

    private Single4() {

    }

    public static Single4 getSingle4(){
        if(single4 == null){
            synchronized (Single4.class){
                if(single4 == null){
                    return new Single4();
                }
            }
        }
        return single4;
    }


}
