package ru.galkin.math;

public class TimeSecond {
    int second;
    int hour;
    int min;

    public TimeSecond(int second) {
        this.second = second % (24 * 60 * 60);
        this.hour = this.second / (60 * 60);
        this.min = (this.second % (60 * 60)) / 60;
        this.second %= 60;
    }

    public TimeSecond(int hour, int min, int second) {
        this.hour = hour;
        this.min = min;
        this.second = second;
    }

    public int getHour(int second) {
        return this.hour;
    }

    public int getMints(int second) {
        return this.min;
    }

    public int getSecond(int second) {
        return this.second;
    }

    public String toString() {
        if (hour > 0 || min > 0) return hour + " " + min + " " + second;

        return hour + " " + min + " " + second;
    }
}