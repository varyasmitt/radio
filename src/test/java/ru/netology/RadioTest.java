package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void nextToMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.next();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void setInvalidStation() {
        Radio service = new Radio();
        service.setCurrentStation(-1);
        int actual = service.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextToOverToFirstStation() {
        Radio service = new Radio();
        service.setCurrentStation(9);
        service.next();
        int actual = service.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextWithInvalidNumberOfStation() {
        Radio service = new Radio();
        service.setCurrentStation(15);
        service.next();
        int actual = service.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void nextFromFirstToLastStation() {
        Radio service = new Radio();
        service.setCurrentStation(8);
        service.next();
        int actual = service.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void nextFromNineToZeroStation() {
        Radio service = new Radio();
        service.setCurrentStation(9);
        service.next();
        int actual = service.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prevToFirstStation() {
        Radio service = new Radio();
        service.setCurrentStation(1);
        service.prev();
        int actual = service.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prevFromFirstToLastStation() {
        Radio service = new Radio();
        service.setCurrentStation(0);
        service.prev();
        int actual = service.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevFromSecondToFirstStation() {
        Radio service = new Radio();
        service.setCurrentStation(-1);
        service.prev();
        int actual = service.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevFromOneToZeroStation() {
        Radio service = new Radio();
        service.setCurrentStation(1);
        service.prev();
        int actual = service.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeForOne() {
        Radio service = new Radio();
        service.increaseVolume();
        int actual = service.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToNine() {
        Radio service = new Radio();
        service.setCurrentVolume(8);
        service.increaseVolume();
        int actual = service.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToMax() {
        Radio service = new Radio();
        service.setCurrentVolume(9);
        service.increaseVolume();
        int actual = service.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOverThanMax() {
        Radio service = new Radio();
        service.setCurrentVolume(10);
        service.increaseVolume();
        int actual = service.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeToOne() {
        Radio service = new Radio();
        service.setCurrentVolume(2);
        service.reduceVolume();
        int actual = service.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeFromZero() {
        Radio service = new Radio();
        service.reduceVolume();
        int actual = service.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeFromTenToNine() {
        Radio service = new Radio();
        service.setCurrentVolume(10);
        service.reduceVolume();
        int actual = service.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void SetInvalidVolumeOverThanLimit() {
        Radio service = new Radio();
        service.setCurrentVolume(11);
        int actual = service.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void SetInvalidVolumeBeforeThanLimit() {
        Radio service = new Radio();
        service.setCurrentVolume(-1);
        int actual = service.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

}