package com.sunqc.shuati.leetcode;

/**
 * 搜索插入位置
 */
public class T35 {
    public int searchInsert( int nums[], int target){
        if (target <= nums[0]){
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++){
            if (target > nums[i] && i < nums.length && target <= nums[i+1]){
                return i+1;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        T35 t = new T35();
        int[] nums = new int[]{
                1,2,3,4,5
        };
        System.out.println(t.searchInsert(nums, 7));

    }
}
