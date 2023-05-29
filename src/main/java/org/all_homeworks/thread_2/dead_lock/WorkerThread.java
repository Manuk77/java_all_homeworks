package org.all_homeworks.thread_2.dead_lock;

import java.util.concurrent.locks.Lock;

public class WorkerThread implements Runnable {
    private final Lock firstLock;
    private final Lock secondLock;

    public WorkerThread(final Lock firstLock, final Lock secondLock) {
        this.firstLock = firstLock;
        this.secondLock = secondLock;
    }

    @Override
    public void run() {
        acquireLocks();
        try {
            // Simulating work
            System.out.println("simulating work");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            releaseLocks();
        }
    }

    private void acquireLocks() {
        boolean acquireFirstLock = false;
        boolean acquireSecondLock = false;

        while (true) {
            System.out.println("acquireLocks");
            try {
                acquireFirstLock = firstLock.tryLock();
                acquireSecondLock = secondLock.tryLock();
            } finally {
                if (acquireFirstLock && acquireSecondLock) {
                    return;
                }
                if (acquireFirstLock) {
                    firstLock.unlock();
                }
                if (acquireSecondLock) {
                    secondLock.unlock();
                }
            }
            // Retry if failed to acquire both locks
            Thread.yield();
        }
    }

    private void releaseLocks() {
        System.out.println("releaseLocks");
        firstLock.unlock();
        secondLock.unlock();
    }

}
