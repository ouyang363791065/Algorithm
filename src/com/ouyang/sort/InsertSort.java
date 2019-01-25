package com.ouyang.sort;

import com.ouyang.utils.ArrayUtils;

import java.util.Arrays;

/**
 * @Author: feixi
 * @Date: 2019/1/24 12:35
 * @Description: com.ouyang.sort
 * @version:1.0
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateRandomArray(10, 0, 10);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 从小到大,就是让数往后移动,直到不能移为止退出,然后插入
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        int j, temp;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                temp = arr[i];
                for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }
    }
}
