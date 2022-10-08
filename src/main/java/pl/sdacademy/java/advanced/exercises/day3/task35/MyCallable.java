package pl.sdacademy.java.advanced.exercises.day3.task35;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Student uczy się do egzaminu");
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Student skończył się uczyć do egzaminu");
        return null;
    }
}
