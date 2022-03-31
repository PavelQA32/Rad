package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int volume;
    private int numberOfStations = 10;


    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setVolume(int volume) {
        if(volume > 100){
            volume = 100;
        }
        if(volume < 0){
            volume = 0;
        }
        this.volume = volume;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public int setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        int currentNumberOfStation = numberOfStations - 1;
        if (currentNumberOfStation <= 0) {
            currentNumberOfStation = 0;
        }
        this.numberOfStations = currentNumberOfStation;
        return this.numberOfStations;
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public Radio() {
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void nextStation() {
        int nextStation = getCurrentStation() + 1;
        if (nextStation > getNumberOfStations() - 1) {
            nextStation = 0;
        }
        currentStation = nextStation;
    }

    public void prevStation() {
        int prevStation = getCurrentStation() - 1;
        if (prevStation < 0) {
            prevStation = numberOfStations - 1;
        }
        currentStation = prevStation;
    }

    public int newCurrentStation(int newCurrentStation) {
        if (newCurrentStation > numberOfStations - 1) {
            newCurrentStation = numberOfStations - 1;
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
        if (increasedVolume > 100) {
            increasedVolume = 100;
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
        volume = 100;
    }

    public void mute() {
        volume = 0;
    }
}




