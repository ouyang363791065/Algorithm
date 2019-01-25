package com.ouyang.sort;

import com.ouyang.utils.ArrayUtils;
import java.util.Arrays;

/**
 * @Author: feixi
 * @Date: 2019/1/24 11:04
 * @Description: com.ouyang.sort
 * @version:1.0
 */
public class SelectSort {

    private static int min;

    public static void main(String[] args){
        int[] arr = ArrayUtils.generateRandomArray(10, 0, 10);
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                ArrayUtils.swap(arr, i, min);
            }
        }
    }
}
