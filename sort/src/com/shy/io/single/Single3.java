package com.shy.io.single;

/**
 * @author 石皓岩
 * @create 2020-04-11 12:56
 * 描述：
 */
public class Single3 {

    private static class Single3Holder {
        private static Single3 single3 = new Single3();
    }

    private Single3() {
    }

    public static Single3 getSingle3(){
        return Single3Holder.single3;
    }

}
