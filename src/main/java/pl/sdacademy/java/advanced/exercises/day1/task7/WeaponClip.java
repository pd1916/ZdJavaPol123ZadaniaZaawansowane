package pl.sdacademy.java.advanced.exercises.day1.task7;

import java.util.ArrayDeque;
import java.util.Deque;

public class WeaponClip {
    private final Deque<String> weaponClip;
    private final int maxNumberOfBulletInClip;

    public WeaponClip(int clipCapacity) {
        this.weaponClip = new ArrayDeque<>();
        maxNumberOfBulletInClip = clipCapacity;
    }

    public boolean loadBullet(String bullet) {
        if(maxNumberOfBulletInClip == weaponClip.size()) {
            //throw new IllegalArgumentException("Clip is full");
            System.out.println("Clip is full");
            return false;
        }
        weaponClip.push(bullet);
        return true;
    }

    public boolean isLoaded() {
        //return weaponClip.size() >= 1;
        return !weaponClip.isEmpty();
    }

    public String shot() {
        if(isLoaded()) {
            return weaponClip.pop();
        }
        System.out.println("Clip is empty");
        return "empty";
    }
}
