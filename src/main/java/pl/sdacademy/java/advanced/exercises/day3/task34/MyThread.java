package pl.sdacademy.java.advanced.exercises.day3.task34;

public class MyThread extends Thread {

    public void run() {
        System.out.println("Początek wątku");
        System.out.println("Nazwa: " + Thread.currentThread().getName());
        System.out.println("Idę spać...");
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Wstałem!");
    }
}
