package pl.sdacademy.java.advanced.exercises.day3.task35;

public class Task35 {
    public static void main(String[] args) throws InterruptedException {
        Thread student1 = new Thread(new MyRunnable());
        Thread student2 = new Thread(new MyRunnable());
        System.out.println("Dzień przed egzaminem...");
        student1.start();
        student2.start();
        student1.join(); // wątek main czeka aż student1 skończy swoją robotę
        student2.join(); // wątek main czeka aż student2 skończy swoją robotę
        System.out.println("EGZAMIN!!!");
    }
}
