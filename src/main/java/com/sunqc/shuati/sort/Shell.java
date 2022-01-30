package com.sunqc.shuati.sort;

import java.util.Arrays;

/**
 * @author : [sun_qichao]
 * @version : [v1.0]
 * @className : Shell
 * @description : 希尔排序
 * @createTime : [2022/1/30 11:09 下午]
 */
public class Shell {
    public static int[] sort(int[] arrays){
        int N = arrays.length;
        int h = 1;
        while (h < N/3){
            h = 3 * h + 1;
        }
        while (h >= 1){
            for (int i = h; i < N; i++){
                for (int j = i; j >= h && arrays[j] < arrays[j-h]; j-=h){
                    int tmp = arrays[j];
                    arrays[j] = arrays[j-h];
                    arrays[j-h] = tmp;
                }
            }
            h = h / 3;
        }
        return arrays;
    }
    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray(8, 7);
        System.out.println("origin arrays is: " + Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));
    }
}
