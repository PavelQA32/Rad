package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void nextStation() {
        int nextStation = getCurrentStation() + 1;
        if (nextStation > 9) {
            nextStation = 0;
        }
        currentStation = nextStation;
    }

    public void prevStation() {
        int prevStation = getCurrentStation() - 1;
        if (prevStation < 0) {
            prevStation = 9;
        }
        currentStation = prevStation;
    }

    public int newCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            newCurrentStation = 9;
            currentStation = newCurrentStation;
        }
        if (newCurrentStation < 0) {
            newCurrentStation = 0;
            currentStation = newCurrentStation;
        }
        currentStation = newCurrentStation;
        return getCurrentStation();
    }

    public void increaseVolume() {
        int increasedVolume = getVolume() + 1;
        if (increasedVolume > 10) {
            increasedVolume = 10;
        }
        volume = increasedVolume;
    }

    public void decreaseVolume() {
        int decreasedVolume = getVolume() - 1;
        if (decreasedVolume < 0) {
            decreasedVolume = 0;
        }
        volume = decreasedVolume;
    }

    public void increaseToMax() {
        volume = 10;
    }

    public void mute() {
        volume = 0;
    }
}




