package com.sunqc.shuati.leetcode;

/**
 * 最长回文字串
 * @author sqc
 *
 */
public class LongestPalindrome {
	/**
	 * 动态规划方法
	 * @param string 待判断的字符串
	 * @param n 字符串长度
	 * @return
	 */
	public int dongtaiguihua(String string, int n) {
		 if (string == null) {
	            return -1;
	        }
	        //记录最长的长度
	        int length = 0;
	        int startIndex = -1;
	        /*
	        1.使用动态规划方法
	         */
	        int[][] dp = new int[n][n];
	        for (int i = 0; i < n - 1; i++) {
	            dp[i][i] = 1;

	            if (string.charAt(i) == string.charAt(i + 1)) {
	                dp[i][i + 1] = 1;
	                length = 2;
	                startIndex = i;
	            }
	        }
	        for (int len = 3; len <= n; len++) {
	            for (int i = 0; i + len - 1 < n; i++) {
	                int j = i + len - 1;

	                if (string.charAt(i) == string.charAt(j) && dp[i + 1][j - 1] == 1) {
	                    dp[i][j] = 1;
	                    startIndex = i;
	                    length = len;
	                }
	            }
	        }
	        return length;
	        
	}
	/**
	 * 中心扩散方法
	 * @param s 待判断的字符串
	 * @return
	 */
	public String zhongxinkuosan(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int max = Math.max(len1, len2);
            //判断当前回文字符串的长度是否大于之前的长度
            if (max > end - start) {
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

}
