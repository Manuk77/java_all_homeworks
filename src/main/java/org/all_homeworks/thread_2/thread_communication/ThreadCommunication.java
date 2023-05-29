package org.all_homeworks.thread_2.thread_communication;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadCommunication {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

        Thread producer = new ProducerThread(queue);
        Thread consumer = new ConsumerThread(queue);

        producer.start();
        consumer.start();

    }
}
