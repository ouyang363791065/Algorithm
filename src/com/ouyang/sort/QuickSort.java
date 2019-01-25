package com.ouyang.sort;

import com.ouyang.utils.ArrayUtils;

import java.util.Arrays;

/**
 * @Author: feixi
 * @Date: 2019/1/24 15:38
 * @Description: com.ouyang.sort
 * @version:1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateRandomArray(10, 0, 10);
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 实现从小到大的排序
     *
     * @param arr
     * @param start
     * @param end
     */
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int i = start;
        int j = end;
        int temp = arr[i];
        if (i < j) {
            while (i < j) {
                while (i < j && arr[j] > temp) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while (i < j && arr[i] < temp) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            //将基准放入
            arr[i] = temp;
            quickSort(arr, 0, i - 1);
            quickSort(arr, i + 1, end);
        }

    }
}