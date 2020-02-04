package com.sunqc.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 两个线程一个打印1-52，另一个打印A-Z
 * @author SQC
 */
public class TwoThread {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition1 = reentrantLock.newCondition();
        Condition condition = reentrantLock.newCondition();
        new Thread(() -> {
            try {
                reentrantLock.lock();
                for (int i = 1; i <= 52 ; i++) {
                    System.out.print(i);
                    if (i % 2 == 0){
                        condition1.await();
                        condition.signalAll();
                    }

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }).start();
        new Thread(() -> {
            try {
                reentrantLock.lock();
                for (int i = 0; i < 26 ; i++) {
                    System.out.print((char)('A' + i) + " ");
                    condition1.signalAll();
                    if ( i != 25){
                        try {
                            condition.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }finally {
                reentrantLock.unlock();
            }

        }).start();
    }
}
