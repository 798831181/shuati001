package com.sunqc.thread;

/**
 * 测试中断线程
 */
public class TestInterruptedThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("test");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        });
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
    }
}
