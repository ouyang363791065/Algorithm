package com.ouyang.utils;

/**
 * @Author: feixi
 * @Date: 2019/1/24 11:13
 * @Description: com.ouyang.utils
 * @version:1.0
 */
public class ArrayUtils {
    /**
     * 生成一个size大小,随机数[start,end)的数组
     * @param size
     * @param start
     * @param end
     * @return
     */
    public static int[] generateRandomArray(int size, int start, int end) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = generateRandomInteger(start, end);
        }
        return arr;
    }

    /**
     * 生成随机数[start,end)左闭右开
     * @param start
     * @param end
     * @return
     */
    private static int generateRandomInteger(int start, int end) {
        return (start + (int) (Math.random() * (end - start)));
    }

    /**
     * 完成交换
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[j] ^ arr[i];
        arr[i] = arr[i] ^ arr[j];
    }
}
