package com.sunqc.javacore.thread.bank;

import org.junit.Test;

public class UnSynchBankTest {
    private static final int NACCOUNTS = 100;
    private static final double INITIAL_BALANCE = 1000;
    private static final double MAX_ACCOUNT = 1000;
    private static final int DELAY = 10;
    private static Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);

    @Test
    public void test() {
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;
            Runnable runnable = () -> {
                while (true) {
                    int toAccount = (int) (Math.random() * bank.size());
                    double amount = MAX_ACCOUNT * Math.random();
                    try {
                        bank.transfer2(fromAccount, toAccount, amount);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep((int) (DELAY * Math.random()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }


    }

    public static void main(String[] args) {
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;
            //代替匿名内部类？
            Runnable runnable = () -> {
                while (true) {
                    int toAccount = (int) (Math.random() * bank.size());
                    double amount = MAX_ACCOUNT * Math.random();
                    bank.transfer(fromAccount, toAccount, amount);
                    try {
                        Thread.sleep((int) (DELAY * Math.random()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
