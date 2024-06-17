package com.ironhack.w1.d4;

public interface IPlayable {
    public abstract void play();
    void pause();
    void mute();
    void incraseVolume();

    final double MAX_VOLUME = 1;
}
