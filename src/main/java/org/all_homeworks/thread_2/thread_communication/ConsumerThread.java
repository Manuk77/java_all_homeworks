package org.all_homeworks.thread_2.thread_communication;




import java.util.concurrent.BlockingQueue;

public class ConsumerThread extends Thread{
    private final BlockingQueue<Integer> queue;

    public ConsumerThread(final BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; ++i) {
                Integer item = queue.take();
                System.out.println("Consuming item " + item);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
