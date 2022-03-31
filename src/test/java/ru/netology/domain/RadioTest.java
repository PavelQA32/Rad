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
    public void shouldSwitchOnNextStation() {
        Radio smart = new Radio();

        smart.nextStation();

        int expected = 1;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchOnNextStationIfCurrentStationEqual9() {
        Radio smart = new Radio();

        smart.newCurrentStation(9);

        smart.nextStation();

        smart.getNumberOfStations();

        int expected = 0;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchOnPreviousStation() {
        Radio smart = new Radio();

        smart.prevStation();

        int expected = 9;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchOnPreviousStationIfCurrentStationEqual1() {
        Radio smart = new Radio();

        smart.newCurrentStation(1);

        smart.prevStation();

        int expected = 0;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio smart = new Radio();

        smart.increaseVolume();

        int expected = 1;
        int actual = smart.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToMax() {
        Radio smart = new Radio();

        smart.increaseToMax();

        int expected = 100;
        int actual = smart.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToMaxAndTryIncreaseMore() {
        Radio smart = new Radio();

        smart.increaseToMax();

        smart.increaseVolume();

        int expected = 100;
        int actual = smart.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMute() {
        Radio smart = new Radio();

        smart.increaseToMax();

        smart.mute();

        int expected = 0;
        int actual = smart.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMuteAndTryDecreaseVolume() {
        Radio smart = new Radio();

        smart.increaseToMax();

        smart.mute();

        smart.decreaseVolume();

        int expected = 0;
        int actual = smart.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio smart = new Radio();

        smart.increaseToMax();

        smart.decreaseVolume();

        int expected = 99;
        int actual = smart.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCreateNewRadio() {
        Radio smart = new Radio(20);

        smart.setCurrentStation(19);

        int expected = smart.getCurrentStation();
        int actual = 19;

        assertEquals(expected, actual);

    }

    @Test

    public void shouldShowCurrentNumberOfStation() {
        Radio smart = new Radio();

        smart.getNumberOfStations();

        smart.setNumberOfStations(3);

        int expected = 2;

        int actual = smart.getNumberOfStations();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldShowNumberOfCurrentStationIfItEqualZero() {
        Radio smart = new Radio();

        smart.setNumberOfStations(0);

        int expected = 0;
        int actual = smart.getNumberOfStations();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchOnZeroStationIfCurrentStationIsMaxAndIncreaseMore() {
        Radio smart = new Radio(100);

        smart.getNumberOfStations();

        smart.newCurrentStation(99);

        smart.getCurrentStation();

        smart.nextStation();

        int expected = 0;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchOnMaxStationIfCurrentStationIsMinAndDecreaseMore() {
        Radio smart = new Radio(147);

        smart.newCurrentStation(0);

        smart.prevStation();

        int expected = 146;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationTest() {
        Radio smart = new Radio(55);

        smart.setCurrentStation(5);

        int expected = 5;
        int actual = smart.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTest() {
        Radio smart = new Radio();

        smart.setVolume(84);

        int expected = 84;
        int actual = smart.getVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCantSetVolumeMoreThenMax(){
        Radio smart = new Radio();

        smart.setVolume(456);

        int expected = 100;
        int actual = smart.getVolume();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldCantSetVolumeLessMin(){
        Radio smart = new Radio();

        smart.setVolume(-4);

        int expected = 0;
        int actual = smart.getVolume();

        assertEquals(expected,actual);
    }

}