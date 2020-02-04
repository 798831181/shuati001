package com.sunqc.shuati.zuoshen;

import java.util.Arrays;

/**
 * 经典快速排序
 * @author sunqc
 */
public class ClassicQuickSort {
    public static void quickSort(int[] list,int first, int last){
        if (last > first){
            int pivotIndex = partition(list,first,last);
            quickSort(list,first,pivotIndex - 1);
            quickSort(list,pivotIndex + 1,last);
        }
    }
    public static int partition(int[] list, int first, int last){
        int pivot = list[first];
        int low = first + 1;
        int high = last;
        while(high > low){
            while (low <= high && list[low] <= pivot){
                low++;
            }
            while (low <= high && list[high] > pivot){
                high--;
            }
            //swap two element in the list
            if (high > low){
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while(high > first && list[high] > pivot){
            high--;
        }
        if (pivot > list[high]){
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }else {
            return first;
        }
    }
    public static void main(String[] args) {
        int[] testArr = {1,3,4,2};
        quickSort(testArr,0, testArr.length-1);
        System.out.println("SortedArr: "+ Arrays.toString(testArr));
    }
}
