package com.ironhack.w1.d3;

public class HorrorMovie extends Movie{
    private boolean isReallyScary;

    public HorrorMovie(String title, int duration, boolean isReallyScary) {
        super(title, duration);
        this.isReallyScary = isReallyScary;
    }

    public HorrorMovie(String title) {
        super(title);
        this.isReallyScary = true;
    }

    public boolean isReallyScary() {
        return isReallyScary;
    }

    public void setReallyScary(boolean reallyScary) {
        isReallyScary = reallyScary;
    }

    public void play() {
        System.out.println("Playing a horror movie");
    }
}
