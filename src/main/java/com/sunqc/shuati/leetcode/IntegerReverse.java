package com.sunqc.shuati.leetcode;
/**
 * 整数反转
 * @author sqc
 *
 */
public class IntegerReverse {
	public int reverse(int source) {
		int rev = 0;
		while (source != 0) {
			int pop = source % 10;
			source = source /10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
				return 0;
			}
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
				return 0;
			}
			rev = rev * 10 + pop;
		}
		return rev;
	}
	public static void main(String[] args) {
		IntegerReverse integerReverse = new IntegerReverse();
		System.out.println(integerReverse.reverse(-900000));
	}
}
