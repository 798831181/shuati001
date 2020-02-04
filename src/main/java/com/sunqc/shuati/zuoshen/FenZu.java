package com.sunqc.shuati.zuoshen;

import java.util.Arrays;

/**
 * 根据num分成两部分
 * PS荷兰国旗问题
 */
public class FenZu {
    public static void solve(int[] arr, int num) {
        if (arr == null) {
            return;
        }
        int p1 = 0;
        int p2 = arr.length - 1;
        while (p1 < p2) {
            while (arr[p1] < num) {
                p1++;
            }
            while (arr[p2] > num) {
                p2--;
            }
            swap(arr, p1, p2);
            p1++;
            p2--;
        }
    }
    public static void solve2(int[] arr, int num){
        if (arr == null) {
            return;
        }
        int[] partition = partition(arr, 0, arr.length - 1, num);
        System.out.println(Arrays.toString(partition));

    }
    public static int[] partition(int[] arr, int L, int R, int num){
        int less = L-1;
        int more = R +1;
        int cur = L;
        while (cur< more){
            if (arr[cur] < num){
                swap(arr,++less,cur++);
            }else if (arr[cur] > more){
                swap(arr,--more,cur);
            }else {
                cur++;
            }
        }
        return new int[]{less+1,more-1};
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] testArr = {1, 6, 4, 32, 2, 3, 51, 1, 3};
        solve(testArr, 3);
        System.out.println(Arrays.toString(testArr));
        solve2(testArr, 3);
    }
}
