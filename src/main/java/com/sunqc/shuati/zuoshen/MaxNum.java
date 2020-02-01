package com.sunqc.shuati.zuoshen;

/**
 *  测试递归调用
 */
public class MaxNum {
    public static int getMax(int[] arr, int L, int R){
        if (L == R){
            return arr[L];
        }
        int middle = (L + R)/2;
        int maxL = getMax(arr,0, middle);
        int maxR = getMax(arr,middle+1,R);
        return Math.max(maxL,maxR);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,13,4,2,12};
        System.out.println(getMax(arr, 0, arr.length - 1));
    }
}
