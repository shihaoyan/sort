package com.shy.jvm;

import com.shy.jvm.sort.SelectSort;
import com.shy.jvm.sort.SortHandler;

import java.util.Date;

/**
 * @author 石皓岩
 * @create 2020-03-15 11:29
 * 描述：
 */
public class App_Main {
    private static int[] arr1 = new int[]{32, 23, 43, 83, 29, 21, 89, 59, 48, 65};
    private static int[] arr2 = new int[800000];

    static {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = ((int) (Math.random() * 8000000));
        }
    }

    public static void main(String[] args) {
        //添加排序规则和将要排序的数组
        SortHandler sortHandler = new SortHandler(new SelectSort(arr1));

        long oldDate = new Date().getTime();
        // 进行排序
        sortHandler.sort();
        long newDate = new Date().getTime();
        System.out.println("排序所用时间（毫秒）" + (newDate - oldDate));
        // 打印数组，有条件 当数组过大的时候不会打印，默认值是10000
        sortHandler.print();


    }


}
