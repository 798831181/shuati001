package com.sunqc.shuati.leetcode;
/**
 * 盛水最多的容器
 * @author sqc
 *
 */
public class T11 {
	/**
	 * 暴力法
	 * @param height
	 * @return
	 */
	public static int maxArea(int[] height) {
		if (height == null || height.length<2) {
			return 0;
		}
		int max = 0;
		for (int i = 0; i < height.length - 1; i++) {
			for (int j = i+1; j < height.length; j++) {
				int cur = (j-i)*Math.min(height[i], height[j]);
				if (cur > max) {
					max = cur;
				}
			}
		}
		return max;
	}
	/**
	 * 双指针方法
	 * @param height
	 * @return
	 */
	public static int maxArea2(int[] height) {
		if (height == null || height.length<2) {
			return 0;
		}
		int left = 0;
		int right = height.length - 1;
		int max = 0;
		while (left < right) {
			max = Math.max((right-left)*Math.min(height[left], height[right]), max);
			if (height[left] < height[right]) {
				left++;
			}else {
				right--;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] testHeight = new int[] {
				1,8,6,2,5,4,8,3,7
		};
		System.out.println(T11.maxArea2(testHeight));
	}

}
