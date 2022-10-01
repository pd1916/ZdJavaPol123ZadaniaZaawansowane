package pl.sdacademy.java.advanced.exercises.day1.task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WeaponClipTest {
    private WeaponClip weaponClip;

    @BeforeEach
    void setUp() {
        weaponClip = new WeaponClip(3);
    }

    @Test
    void shouldBePossibleToAddNewBulletIfClipIsNotEmpty() {
        //when
        boolean result = weaponClip.loadBullet("nabój_1");
        //then
        assertTrue(result); //junit
        assertThat(result).isTrue(); //assertJ
        assertThat(weaponClip.isLoaded()).isTrue();
    }

    @Test
    void shouldNotBePossibleToAddNewBulletIfClipIsFull() {
        //given
        weaponClip.loadBullet("nabój_1");
        weaponClip.loadBullet("nabój_2");
        weaponClip.loadBullet("nabój_3");
        //when
        boolean result = weaponClip.loadBullet("nabój_4");
        //then
        assertFalse(result); //junit
        assertThat(result).isFalse(); //assertJ
    }

    @Test
    void shouldBePossibleToShotBulletIfClipIsNotEmpty() {
        //given
        weaponClip.loadBullet("nabój_1");
        weaponClip.loadBullet("nabój_2");
        weaponClip.loadBullet("nabój_3");
        String expectedResult = "nabój_3";
        //when
        String result = weaponClip.shot();
        //then
        assertEquals(expectedResult, result); //junit
        assertThat(result).isEqualTo(expectedResult); //assertj
    }

    @Test
    void shouldBeNotPossibleToShotBullerIfClipIsEmpty() {
        //given
        String expectedResult = "empty";
        //when
        String result = weaponClip.shot();
        //then
        assertEquals(expectedResult, result); //junit
        assertThat(result).isEqualTo(expectedResult); //assertj
    }


}