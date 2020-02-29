package com.sunqc.shuati.utils;

import java.util.Arrays;

/**
 * 国家枚举
 *
 * @author SQC
 */

public enum CountryEnum {
    /**
     * 夏朝
     */
    ONE(1, "夏"),
    /**
     * 商
     */
    TWO(2, "商"),
    /**
     * 周
     */
    THREE(3, "周"),
    /**
     * 魏
     */
    FOUR(4, "魏"),
    /**
     * 吴
     */
    FIVE(5, "吴");


    private int number;

    private String value;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

     CountryEnum(int number, String value) {
        this.number = number;
        this.value = value;
    }

    CountryEnum() {
    }

    public static CountryEnum foreach_CountryEnum(int index){
        CountryEnum[] values = CountryEnum.values();
        for (CountryEnum value : values) {
            if (index == value.getNumber()){
                return value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(CountryEnum.values()));
        System.out.println(CountryEnum.ONE.getValue());
    }



}
