package org.all_homeworks.thread_2.thread_cordination;

import java.util.concurrent.CountDownLatch;

public class WorkingThread extends Thread{
    private final CountDownLatch latch;

    public WorkingThread(final String name, CountDownLatch latch) {
        super(name);
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");

        try {
            Thread.sleep(500);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " was completed");
        latch.countDown();
    }
}
