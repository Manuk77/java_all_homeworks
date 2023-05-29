package org.all_homeworks.thread_2.thread_cordination;

import java.util.concurrent.CountDownLatch;

public class ThreadCoordination {
    public static void main(String[] args) {
        CountDownLatch count = new CountDownLatch(4);

        for (int i = 1; i < 5; ++i) {
           Thread thread = new WorkingThread("Thread" + i, count);
           thread.start();
        }

        try {
            count.await();
            System.out.println("All working threads are completed");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
