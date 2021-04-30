package com.sunqc.shuati.leetcode;

/**
 * 删除有序数组中的重复数字
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < result; i++){
            if (i+1 < nums.length && nums[i] == nums[i+1]){
                result--;
//                manual copy arrays
//                for (int j = i; j < nums.length - 1; j++ ){
//                    nums[j] = nums[j+1];
//                }
                System.arraycopy(nums, i+1, nums, i, nums.length - 1 - i);
                i--;
            }
        }
        return result + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates r = new RemoveDuplicates();
        int[] a = new int[]{
                1,2,2,2,3,3,3,3,3,4,5
        };
        int n = r.removeDuplicates(a);
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }

    }
}
