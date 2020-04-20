package com.shy.sort;

/**
 * @author 石皓岩
 * @create 2020-04-13 22:28
 * 描述：
 */
public interface SortApi {

    default void sort(int[] arr) {
        throw new RuntimeException("您必须重写这个方法");
    }

    default void sort(int[] arr, int left, int right) {
        throw new RuntimeException("您必须重写这个方法");
    }


}
