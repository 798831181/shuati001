package com.sunqc.shuati.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 有效的括号
 */
public class T20ValidKuoHao {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            //遇到右括号
            if (map.containsKey(s.charAt(i))){
                if (stack.isEmpty() || stack.pop() != map.get(s.charAt(i))){
                    return false;
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        T20ValidKuoHao t20ValidKuoHao = new T20ValidKuoHao();
        System.out.println(t20ValidKuoHao.isValid("[{}]"));
    }
}
