package com.shy.sort;

/**
 * @author 石皓岩
 * @create 2020-04-13 22:26
 * 描述：
 */
public class BubblingSort extends AbstractSort {


    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


}
