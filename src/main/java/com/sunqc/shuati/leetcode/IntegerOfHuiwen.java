package com.sunqc.shuati.leetcode;
/**
 * 判断一个整数是否是回文
 * @author sqc
 *
 */
public class IntegerOfHuiwen {
    public boolean isPalindrome(int x) {
    	String string = x + "";
    	int left = 0;
    	int right = string.length()-1;
    	while (left <= right) {
			if (string.charAt(left) == string.charAt(right)) {
				left++;
				right--;
			}else {
				return false;
			}
		}
    	return true;
    }

    public static void main(String[] args) {
		IntegerOfHuiwen integerOfHuiwen = new IntegerOfHuiwen();
		System.out.println(integerOfHuiwen.isPalindrome(101));
	}
}
