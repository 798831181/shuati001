package com.sunqc.shuati.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Z字形变换
 * @author sqc
 *
 */
public class ZTransfer {

	public String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		List<StringBuilder> rows = new ArrayList<>();
		for (int i = 0; i < Math.min(numRows, s.length()); i++) {
			rows.add(new StringBuilder());	        	
		}
		int curRow = 0;
		boolean goingDown = false;

		for (char c : s.toCharArray()) {
			rows.get(curRow).append(c);
			if (curRow == 0 || curRow == numRows - 1) {
				goingDown = !goingDown;
			}
			curRow += goingDown ? 1 : -1;
		}

		StringBuilder ret = new StringBuilder();
		for (StringBuilder row : rows) {
			ret.append(row);
		}
		return ret.toString();

	}
	public static void main(String[] args) {
		ZTransfer zTransfer = new ZTransfer();
		System.out.println(zTransfer.convert("zxcvbnmasdfgh", 3));
	}

}
