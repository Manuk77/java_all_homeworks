package org.all_homeworks.thread_2.thread_prioritization;

public class ThreadPrioritization {

    public static void main(String[] args) {
        Thread thread1 = new WorkingThread("Thread1", Thread.MIN_PRIORITY);
        Thread thread2 = new WorkingThread("Thread2", Thread.NORM_PRIORITY);
        Thread thread3 = new WorkingThread("Thread3", Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

    }


}
