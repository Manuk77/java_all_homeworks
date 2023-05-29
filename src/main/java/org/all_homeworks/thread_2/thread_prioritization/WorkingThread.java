package org.all_homeworks.thread_2.thread_prioritization;

class WorkingThread extends Thread {
    public WorkingThread(final String name, final int priority) {
        super(name);
        setPriority(priority);
    }
    @Override
    public void run() {
        System.out.println(getName() + " started");
        for (int i = 1; i < 6; ++i) {
            System.out.println(getName() +": " + i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}