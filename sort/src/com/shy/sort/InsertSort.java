package com.shy.sort;

/**
 * @author 石皓岩
 * @create 2020-04-13 22:47
 * 描述：
 */
public class InsertSort extends AbstractSort {

    /**
     * 插入排序
     *
     * @param arr
     */
    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
    }

}
