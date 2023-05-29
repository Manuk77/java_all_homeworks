package org.all_homeworks.thread_2.thread_safety;

public class ThreadSafety {

    public static void main(String[] args) {
        DataStore dataStore = new DataStore();

        Runnable readTask = () -> {
            for (int i = 1; i <= 5; i++) {
                int value = dataStore.readData();
                System.out.println(Thread.currentThread().getName() + " read: " + value);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable writeTask = () -> {
            for (int i = 1; i <= 5; i++) {
                dataStore.writeData(i);
                System.out.println(Thread.currentThread().getName() + " wrote: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Create multiple reader threads
        for (int i = 1; i <= 3; i++) {
            new Thread(readTask, "Reader " + i).start();
        }

        // Create a single writer thread
        new Thread(writeTask, "Writer").start();
    }
}

