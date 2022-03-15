package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldShowCurrentStation() {
        Radio smart = new Radio();

        smart.getCurrentStation();

        int expected = 0;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchOnChosenStationIfChosenStationBiggerThan9() {
        Radio smart = new Radio();

        smart.newCurrentStation(10);

        int expected = 9;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchOnChosenStationIfChosenStationEqual9() {
        Radio smart = new Radio();

        smart.newCurrentStation(9);

        int expected = 9;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);

    }


    @Test
    public void shouldSwitchOnChosenStationIfChosenStationEqual1() {
        Radio smart = new Radio();

        smart.newCurrentStation(1);

        int expected = 1;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchOnChosenStationIfChosenStationEqual0() {
        Radio smart = new Radio();

        smart.newCurrentStation(0);

        int expected = 0;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchOnChosenStationIfChosenStationEqualNegative() {
        Radio smart = new Radio();

        smart.newCurrentStation(-1);

        int expected = 0;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchOnNextStation(){
        Radio smart = new Radio();

        smart.nextStation();

        int expected = 1;
        int actual = smart.getCurrentStation();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchOnNextStationIfCurrentStationEqual9(){
        Radio smart = new Radio();

        smart.newCurrentStation(9);

        smart.nextStation();

        int expected = 0;
        int actual = smart.getCurrentStation();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchOnPreviousStation(){
        Radio smart = new Radio();

        smart.prevStation();

        int expected = 9;
        int actual = smart.getCurrentStation();
    }
    @Test
    public void shouldSwitchOnPreviousStationIfCurrentStationEqual1(){
        Radio smart = new Radio();

        smart.newCurrentStation(1);

        smart.prevStation();

        int expected = 0;
        int actual = smart.getCurrentStation();
    }
    @Test
    public void shouldIncreaseVolume(){
        Radio smart = new Radio();

        smart.increaseVolume();

        int expected = 1;
        int actual = smart.getVolume();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolumeToMax(){
        Radio smart = new Radio();

        smart.increaseToMax();

        int expected = 10;
        int actual = smart.getVolume();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolumeToMaxAndTryIncreaseMore(){
        Radio smart = new Radio();

        smart.increaseToMax();

        smart.increaseVolume();

        int expected = 10;
        int actual = smart.getVolume();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldMute(){
        Radio smart = new Radio();

        smart.increaseToMax();

        smart.mute();

        int expected = 0;
        int actual = smart.getVolume();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldMuteAndTryDecreaseVolume(){
        Radio smart = new Radio();

        smart.increaseToMax();

        smart.mute();

        smart.decreaseVolume();

        int expected = 0;
        int actual = smart.getVolume();

        assertEquals(expected,actual);
    }
}