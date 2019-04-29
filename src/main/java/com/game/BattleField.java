package com.game;

import jline.console.ConsoleReader;

import java.io.IOException;

public class BattleField {

    public char[][] array = new char[10][10];

    BattleField() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';
            }
        }
    }

    public void printArray( ConsoleReader reader) throws IOException {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 & j == 0) str += " ----------\n|";
                str += array[i][j];
            }
            if (i == array.length - 1) {
                str += "|\n";
                str += " ----------";
            } else
                str += "|\n|";
        }
        reader.print(str);
        reader.flush();
    }

}
