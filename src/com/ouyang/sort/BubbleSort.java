package com.ouyang.sort;

import com.ouyang.utils.ArrayUtils;

import java.util.Arrays;

/**
 * @Author: feixi
 * @Date: 2019/1/23 22:45
 * @Description: com.ouyang.sort
 * @version:1.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateRandomArray(10, 0, 10);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayUtils.swap(arr, i, j);
                }
            }
        }
    }

}
