package com.sunqc.shuati.leetcode;

/**
 * 移除元素
 */
public class T27 {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len;) {
            //与指定数值相等，当前位置与尾部位置交换
            if (nums[i] == val){
                nums[i] = nums[len - 1];
                len--;
            }else {
                i++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        T27 test = new T27();
        int[] nums = new int[]{
                1,2,2,2,3,4,2,2,5
        };
        System.out.println(test.removeElement(nums, 2));
    }

}
