package com.game;

import java.io.IOException;

public class BattleField {

    public char[][] array = new char[10][10];

    BattleField() {
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                array[i][j] = ' ';
            }
        }
    }

    public String printArray() throws IOException {
        String str = "";
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                if (i == 0 & j == 0) str += " ----------\n|";
                str += array[i][j];
            }
            if (i == getHeight() - 1) {
                str += "|\n";
                str += " ----------";
            } else
                str += "|\n|";
        }
        return str;
    }

    public Position moveToPosition(Position newPosition, Position oldPosition, char symbol) {
        if (newPosition.getX() >= 0 && newPosition.getX() < getHeight()
                && newPosition.getY() >= 0 && newPosition.getY() < getWidth()) {
            array[oldPosition.getX()][oldPosition.getY()] = ' ';
            array[newPosition.getX()][newPosition.getY()] = symbol;
            return newPosition;
        } else {
            return oldPosition;
        }
    }

    private int getHeight() {
        return array.length;
    }
    private int getWidth(){
        return array[0].length;
    }
}
