package org.all_homeworks.thread_2.thread_communication;

import java.util.concurrent.BlockingQueue;

public class ProducerThread extends Thread{
    private final BlockingQueue<Integer> queue;

    public ProducerThread(final BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; ++i ) {
                System.out.println("Producing item " + i);
                queue.put(i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
