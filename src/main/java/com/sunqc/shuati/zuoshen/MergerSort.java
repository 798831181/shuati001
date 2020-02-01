package com.sunqc.shuati.zuoshen;

/**
 * 归并排序
 */
public class MergerSort {
    public static void sort(int[] arr, int L, int R){
        if (arr == null || arr.length < 2) {
            return;
        }
        if (L == R){
            return;
        }
        int mid = (L+R)/2;
        sort(arr,0,mid);
        sort(arr,mid+1,R);
        merger(arr,L,R);
    }
    public static void merger(int[] arr, int L, int R){
        int[] help  = new int[R - L + 1];
        int mid = (L + R) / 2;
        int p1 = L;
        int p2 = mid + 1;
        int i = 0;
        while(p1 <= mid && p2 <= R ){
            help[i++] = arr[p1] < arr[p2]? arr[p1++] : arr[p2++];
        }
        while(p1 <= mid){
            help[i++] = arr[p1++];
        }
        while(p2 <= R){
            help[i++] = arr[p2++];
        }
        for (int j = 0; j < help.length; j++){
            arr[L+j] = help[j];
        }
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
//        System.out.println(Arrays.toString(sort(arr,););));
        sort(arr,0,arr.length-1);
        System.out.println("final");
    }

}
