package pl.sdacademy.java.advanced.exercises.day3.task34;

public class Task34 {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        thread1.start();
        thread1.join();
        System.out.println("Main: przed pójściem spać");
        Thread.sleep(3000);
        System.out.println("Main: po pójściu spać");
        thread1.interrupt();
        System.out.println("Koniec metody main");
//
//        MyThread thread2 = new MyThread();
//        thread2.start();
//
//        System.out.println(Thread.activeCount());
    }
}
