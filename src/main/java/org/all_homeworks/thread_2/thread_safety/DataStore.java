package org.all_homeworks.thread_2.thread_safety;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class DataStore {
    private int data = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public int readData() {
        lock.readLock().lock();
        try {
            return data;
        } finally {
            lock.readLock().unlock();
        }
    }

    public void writeData(int value) {
        lock.writeLock().lock();
        try {
            data = value;
        } finally {
            lock.writeLock().unlock();
        }
    }
}

