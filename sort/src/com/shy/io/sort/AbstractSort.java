package com.shy.io.sort;

/**
 * @author 石皓岩
 * @create 2020-04-13 23:05
 * 描述：
 */
public abstract class AbstractSort implements SortApi{
    protected int[] array;

    public AbstractSort setArray(int[] array) {
        this.array = array;
        return this;
    }

    public int[] getArray() {
        return array;
    }

    public AbstractSort(int[] array){
        this.array = array;
    }
    public AbstractSort(){

    }
}
