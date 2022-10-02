package pl.sdacademy.java.advanced.exercises.day2.task16;

import java.util.Arrays;

public enum Runner {
    BEGINNER(512, Integer.MAX_VALUE),
    INTERMEDIATE(256, 511),
    ADVANCED(0, 255);

    private final int minMinutes;
    private final int maxMinutes;

    Runner(int minMinutes, int maxMinutes) {
        this.minMinutes = minMinutes;
        this.maxMinutes = maxMinutes;
    }

    // runningTimeInMinutes = 500
    public static Runner getFitnessLevel(int runningTimeInMinutes) {
        //Option#1
//        for(Runner runner : values()) {
//            if(runningTimeInMinutes <= runner.maxMinutes && runningTimeInMinutes >= runner.minMinutes) {
//                return runner;
//            }
//        }
//        return BEGINNER; // nie powinno się to wydarzyć, ale jako default zwrócimy wtedy BEGINNER

        //Option#2
        return Arrays.stream(values())
                .filter(runner -> runningTimeInMinutes <= runner.maxMinutes && runningTimeInMinutes >= runner.minMinutes)
                .findFirst()
                //.orElse(BEGINNER);
                .orElseThrow(() -> new IllegalArgumentException("Podany czas jest spoza zakresu"));
    }
}
