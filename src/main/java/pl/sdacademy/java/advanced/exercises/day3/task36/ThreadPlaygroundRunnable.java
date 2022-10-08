package pl.sdacademy.java.advanced.exercises.day3.task36;

public class ThreadPlaygroundRunnable implements Runnable{
    private final String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        for(int i = 0; i <=10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
