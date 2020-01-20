package com.sunqc.shuati.utils;

/**
 * 交换两个数
 *
 * @author SQC
 */
public class Swap<T> {
    public void swap(T v1, T v2) {
        T temp = v1;
        v1 = v2;
        v2 = temp;
    }
}
