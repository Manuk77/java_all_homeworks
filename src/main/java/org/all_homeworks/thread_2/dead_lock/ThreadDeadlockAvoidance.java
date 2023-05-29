package org.all_homeworks.thread_2.dead_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDeadlockAvoidance {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread thread1 = new Thread(new WorkerThread(lock1, lock2));
        Thread thread2 = new Thread(new WorkerThread(lock1, lock2));

        thread1.start();
        thread2.start();
    }
}
