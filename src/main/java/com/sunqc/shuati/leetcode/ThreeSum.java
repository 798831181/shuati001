package com.sunqc.shuati.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * 查找三个元素，相加等于指定数
 */
public class ThreeSum {
	public static int[] f1(int[] arr, int target) {
		Arrays.sort(arr);
		int[] result = new int[3];
		for (int i = 0; i < arr.length - 2; i++) {
			result[0] = arr[i];
			int left = i + 1;
			int right = arr.length - 1;
			while (left < right) {
				if (arr[i] + arr[left] + arr[right] == target) {
					result[1] = arr[left];
					result[2] = arr[right];
					return result;
				} else if ((arr[i] + arr[left] + arr[right]) < target) {
					left++;
				} else {
					right--;
				}
			}
		}
		return result;
	}

	/**
	 * 返回结果去除重复的组合
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> myThreeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		if(nums == null || nums.length <= 2){
			return list;
		}
		Arrays.sort(nums);
		int left = 0;
		int right = 0;
		for(int i = 0; i < nums.length - 2; i++){
			if (i >= 1 && nums[i] == nums[i-1]) {
				continue;
			}
			left = i + 1;
			right = nums.length - 1;
			while(left < right){
				if(nums[i] + nums[left] + nums[right] == 0){
					List<Integer> res = new ArrayList<>();
					res.add(nums[i]);
					res.add(nums[left]);
					res.add(nums[right]);
					list.add(res);
					while(left < right && nums[left] == nums[left + 1]){
						left++;
					}
					while(left < right && nums[right] == nums[right - 1]){
						right--;
					}
					left++;
					right--;
				}else if(nums[i] + nums[left] + nums[right] < 0){
					left++;
				}else if(nums[i] + nums[left] + nums[right] > 0){
					right--;
				}                                
			}
		}
		return list;
	}

	public static void main(String[] args) {
		ThreeSum threeSum = new ThreeSum();
		int[] testnums = new int[] {
				0,0,0
		};
		System.out.println(threeSum.myThreeSum(testnums));
	}
}
