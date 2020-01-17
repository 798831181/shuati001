package com.sunqc.shuati.leetcode;
/**
 * 字符串转整数
 * @author sqc
 *
 */
public class String2Integer {
	/**
	 * string2integer
	 * @param string
	 * @return
	 */
	public int convert(String string) throws Exception  {
		if(string == null || string.trim().length() == 0) {
			return 0;
		}		
			StringBuilder sBuilder = null;
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == ' ') {
					continue;
				}
				if (string.charAt(i) == '-' || Character.isDigit(string.charAt(i))) {
					sBuilder = new StringBuilder();
					sBuilder.append(string.charAt(i));
					for (int j = i+1; j < string.length(); j++) {
						if (Character.isDigit(string.charAt(j))) {
							sBuilder.append(string.charAt(j));
						}
					}
				}else if (string.charAt(i) == '+') {
					sBuilder = new StringBuilder();
					for (int j = i+1; j < string.length(); j++) {
						if (Character.isDigit(string.charAt(j))) {
							sBuilder.append(string.charAt(j));
						}
					}
//					return Integer.parseInt(sBuilder.toString());
				}else {
					return 0;					
				}
				int result = Integer.valueOf((sBuilder.toString()));
				if (result > Integer.MAX_VALUE) {
					
				}else if ( result < Integer.MIN_VALUE) {
					return Integer.MAX_VALUE;
					
				}else {
					return Integer.parseInt(sBuilder.toString());
				}
			}
			return 0;
	}
	public static void main(String[] args) throws Exception {
		String2Integer string2Integer = new String2Integer();
		System.out.println(string2Integer.convert("-91283472332"));
	}

}
