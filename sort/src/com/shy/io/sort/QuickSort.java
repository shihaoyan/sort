package com.shy.io.sort;

/**
 * @author 石皓岩
 * @create 2020-04-13 21:53
 * 描述：
 */
public class QuickSort extends AbstractSort {

    @Override
    public void sort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int temp = 0;
        int pivot = arr[(left + right) / 2];

        while (l < r) {

            while (arr[l] < pivot) {
                l += 1;
            }
            while (arr[r] > pivot) {
                r -= 1;
            }

            if (l >= r) {
                break;
            }

            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;


            if (arr[l] == pivot) {
                r -= 1;
            }
            if (arr[r] == pivot) {
                l += 1;
            }

        }

        if (l == r) {
            l += 1;
            r -= 1;
        }

        if (left < r) {
            sort(arr, left, r);
        }

        if (right > l) {
            sort(arr, l, right);
        }


    }



}
