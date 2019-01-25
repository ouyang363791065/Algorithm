package com.ouyang.sort;

import com.ouyang.utils.ArrayUtils;
import java.util.Arrays;

/**
 * @Author: feixi
 * @Date: 2019/1/24 15:05
 * @Description: com.ouyang.sort
 * @version:1.0
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateRandomArray(10, 0, 10);
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        int increasement = arr.length;
        int j;
        do {
            increasement = increasement / 3 + 1;
            for (int i = increasement; i < arr.length; i += increasement) {
                if (arr[i] < arr[i - increasement]) {
                    int temp = arr[i];
                    for (j = i - increasement; j >= 0 && temp < arr[j]; j -= increasement) {
                        arr[j + increasement] = arr[j];
                    }
                    arr[j + increasement] = temp;
                }
            }
        } while (increasement != 1);
    }
}
