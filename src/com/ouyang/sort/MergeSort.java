package com.ouyang.sort;

import com.ouyang.utils.ArrayUtils;

import java.util.Arrays;


/**
 * @Author: feixi
 * @Date: 2019/1/25 13:28
 * @Description: com.ouyang.sort
 * @version:1.0
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateRandomArray(10, 0, 10);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 归并排序
     *
     * @param arr
     * @param start
     * @param end
     */
    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        //分组
        int mid = (start + end) / 2;
        //左边进行递归合并
        mergeSort(arr, start, mid);
        //右边进行递归合并
        mergeSort(arr, mid + 1, end);
        //合并
        merge(arr, start, end, mid);
    }

    /**
     * 合并算法
     *
     * @param arr
     * @param start
     * @param end
     * @param mid
     */
    private static void merge(int[] arr, int start, int end, int mid) {
        int[] temp = new int[arr.length];
        int iStart = start;
        int iEnd = mid;
        int jStart = mid + 1;
        int jEnd = end;
        int length = 0;

        //控制条件成立才执行,逐步将小的数按顺序放入辅助空间
        while (iStart <= iEnd && jStart <= jEnd) {
            //如果左半部分第一个数小右半部分第一个数
            if (arr[iStart] < arr[jStart]) {
                temp[length++] = arr[iStart++];
            } else {
                temp[length++] = arr[jStart++];
            }
        }
        //执行完会剩下有一个序列剩下一个数或者多个数
        //假如为左边的
        while (iStart <= iEnd) {
            temp[length++] = arr[iStart++];
        }
        //假如为右边的
        while (jStart <= jEnd) {
            temp[length++] = arr[jStart++];
        }
        //辅助空间覆盖原来空间
        for (int i = 0; i < length; i++) {
            arr[start + i] = temp[i];
        }
    }
}
