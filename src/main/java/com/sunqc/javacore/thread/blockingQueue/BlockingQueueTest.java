package com.sunqc.javacore.thread.blockingQueue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


/**
 * 测试阻塞队列
 */
public class BlockingQueueTest {
    private static final int FILE_QUEUE_SIZE = 10;
    private static final int SEARCH_THREAD = 100;
    private static final File DUMMY = new File(" ");
    private static BlockingQueue<File> blockingQueue = new ArrayBlockingQueue<>(FILE_QUEUE_SIZE);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base directory: ");
        String directory = scanner.nextLine();
        System.out.println("Enter key words: ");
        String keyword = scanner.nextLine();

        Runnable enumerator = () -> {
            try {
                enumerate(new File(directory));
                blockingQueue.put(DUMMY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(enumerator).start();
        for (int i = 0; i < SEARCH_THREAD; i++) {
            Runnable searcher = () -> {
                boolean done = false;
                while (!done) {
                    try {
                        File file = blockingQueue.take();
                        if (file == DUMMY) {
                            blockingQueue.put(file);
                            done = true;
                        } else {
                            search(file, keyword);
                        }
                    } catch (InterruptedException | FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            };
            new Thread(searcher).start();
        }

    }

    private static void search(File file, String keyword) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file, "UTF-8");) {
            int lineNumber = 0;
            while (scanner.hasNextLine()) {
                lineNumber++;
                String line = scanner.nextLine();
                if (line.contains(keyword)) {
                    System.out.printf("%s:%d:%s%n", file.getPath(), lineNumber, line);
                }
            }
        }
    }

    private static void enumerate(File directory) throws InterruptedException {
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                enumerate(file);
            } else {
                blockingQueue.put(file);
            }
        }
    }

}
