package com.sunqc.shuati.utils;

/**
 * 常量枚举类
 * @author 孙启超
 */

public enum Constant {
    // 点
    DOT("."),
    // 斜线
    SLASH("/"),
    ;

    private String msg;
    Constant(String msg) {
        this.msg = msg;
    }
    public String getMsg(){
        return msg;
    }

}
