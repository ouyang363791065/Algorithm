package com.ouyang.sort;

import com.ouyang.utils.ArrayUtils;

import java.util.Arrays;

/**
 * @Author: feixi
 * @Date: 2019/1/25 18:14
 * @Description: com.ouyang.sort
 * @version:1.0
 */
public class HeapSort {
    private static final int SPIT = 2;

    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateRandomArray(10, 0, 10);
        heapSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 思路：先求出中间那个数,然后将数组元素对应上完全二叉树,对求出中间数的角标定为index,
     * 然后根据完全二叉树性质,左孩子角标为2*index+1(角标index从0开始),右孩子角标为2*index+2,
     * 然后找出左右孩子以及index元素哪个更大,将它和index元素互换,然后同样的方法处理0-index的元素,
     * 直到顶部元素最大,然后将顶部元素和尾部元素互换,随后求剩下元素(出去尾部元素)中间数角标为index,
     * 重复上面操作即可。
     */
    public static void heapSort(int[] arr, int len) {
        //初始化堆
        for (int i = len / SPIT - 1; i >= 0; i--) {
            heapAdjust(arr, i, len);
        }

        //交换堆顶元素和最后一个元素
        for (int i = len - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapAdjust(arr, 0, i);
        }

    }

    private static void heapAdjust(int[] arr, int index, int len) {
        int max = index;
        int lChild = 2 * index + 1;
        int rChild = 2 * index + 2;

        //将最大的数放在父节点
        if (lChild < len && arr[lChild] > arr[max]) {
            max = lChild;
        }
        if (rChild < len && arr[rChild] > arr[max]) {
            max = rChild;
        }

        //交换两个节点
        if (max != index) {
            swap(arr, max, index);
            heapAdjust(arr, max, len);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[j] ^ arr[i];
        arr[i] = arr[i] ^ arr[j];
    }
}
