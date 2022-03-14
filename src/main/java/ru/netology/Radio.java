package ru.netology;

public class Radio {
    public int currentStation;
    public int firstStation = 0;
    public int lastStation = 9;
    public int maxVolume = 10;
    public int minVolume = 0;
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < firstStation) {
            return;
        }
        if (newCurrentStation > lastStation) {
            return;
        }

        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation < lastStation) {
            currentStation += 1;
            return;
        }
        currentStation = firstStation;
    }

    public void prev() {
        if (currentStation > firstStation) {
            currentStation -= 1;
            return;
        }
        currentStation = lastStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        }
    }


}