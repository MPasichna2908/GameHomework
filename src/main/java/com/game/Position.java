package com.game;

public class Position {
    private int positionX;
    private int positionY;

    Position(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }
}