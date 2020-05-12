package com.shy.io.sort;

/**
 * @author 石皓岩
 * @create 2020-04-13 22:44
 * 描述：
 */
public class SelectSort extends AbstractSort {

    public SelectSort(int[] array){
        super.array = array;
    }

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    index = j;
                    min = arr[j];
                }
            }
            if (index != i) {
                arr[index] = arr[i];
                arr[i] = min;
            }
        }
    }
}
