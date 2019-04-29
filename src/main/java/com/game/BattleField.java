package com.game;

import jline.console.ConsoleReader;

import java.io.IOException;

public class BattleField {

    public char[][] array = new char[10][10];
    private int a,b;

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


    public char[][] printMonster() {
        array[b][a] = ' ';
        if (b == 0) {
            b = (int) (Math.random() * (2)) + (b);
        }
        if (a == 0) {
            a = (int) (Math.random() * (2)) + (a);
        }
        if (b == array.length - 1) {
            b = (int) (Math.random() * (2)) + (b - 1);
        }
        if (a == array.length - 1) {
            a = (int) (Math.random() * (2)) + (a - 1);
        }
        if (a > 0 && a <array.length - 1) {
            a = (int) (Math.random() * (3)) + (a - 1);
        }
        if (b < array.length - 1 && b > 0) {
            b = (int) (Math.random() * (3)) + (b - 1);
        }
        array[b][a] = 'M';
        return array;

    }
//masivy
    //не парься - созвонимся и я расскажу - ну так я расскажу
    //создать здесь метод который отдает массив
    //снабдить этим массиво методы в мэйне
}
