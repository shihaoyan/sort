package com.shy.sort;

import java.util.Arrays;

/**
 * @author 石皓岩
 * @create 2020-04-13 22:28
 * 描述：
 */
public class SortHandler {

    private AbstractSort abstractSort;


    public AbstractSort getSortApi() {
        return abstractSort;
    }

    public void setSortApi(AbstractSort sortApi) {
        this.abstractSort = sortApi;
    }

    public SortHandler(AbstractSort sortApi) {
        this.abstractSort = sortApi;
    }

    public void sort() {
        abstractSort.sort(abstractSort.getArray());
    }

    public void sort(int left, int right) {
        abstractSort.sort(abstractSort.getArray(), left, right);
    }

    public void print() {
        print(10000);
    }
    public void print(int n) {
        if (abstractSort.getArray().length > n) {
            return;
        }
        System.out.println(Arrays.toString(abstractSort.getArray()));
    }


}
