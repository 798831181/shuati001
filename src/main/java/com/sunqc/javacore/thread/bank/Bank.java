package com.sunqc.javacore.thread.bank;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author s
 */
public class Bank {
    private final double[] accounts;
    /**
     * new lock
     */
    private Lock bankLock = new ReentrantLock();
    private Condition bankCondition;

    Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    /**
     * 和transfer()具有相同锁的方法
     */
    public void f() {
        bankLock.lock();
        try {
            System.out.println("和transfer()具有相同锁的方法");
        } finally {
            bankLock.unlock();
        }
    }

    public void transfer(int from, int to, double amount) {
        bankCondition = bankLock.newCondition();
        //使用ReentrantLock保护代码块
        bankLock.lock();
        try {
//            if (accounts[from] < amount) {
//                return;
//            }
            while(accounts[from] < amount){
                bankCondition.await();
            }
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf("Total balance: %10.2f%n", getTotalBalance());
            f();
            bankCondition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bankLock.unlock();
        }
    }

    /**
     * 使用synchronized的转账方法
     * @param from
     * @param to
     * @param amount
     */
    public synchronized void transfer2(int from, int to, double amount) throws InterruptedException {
        while(accounts[from] < amount){
            wait();
        }
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf("%10.2f from %d to %d",amount,from,to);
        accounts[to] += amount;
        System.out.println("total balance: " + getTotalBalance());
        notifyAll();
    }

    /**
     * gets sum of all account balances
     * @return
     */
    private double getTotalBalance() {
        bankLock.lock();
        try {
            double sum = 0;
            for (double account : accounts) {
                sum += account;
            }
            return sum;
        } finally {
            bankLock.unlock();
        }
    }

    public int size() {
        return accounts.length;
    }
}
