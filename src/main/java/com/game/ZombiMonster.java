package com.game;

public class ZombiMonster {
    private BattleField battleField;
    ZombiMonster (BattleField battleField){
        this.battleField=battleField;
    }
    private int x, y;
    public char[][] printMonster() {
        battleField.array[y][x] = ' ';
        if (y == 0) {
            y = (int) (Math.random() * (2)) + (y);
        }
        if (x == 0) {
            x = (int) (Math.random() * (2)) + (x);
        }
        if (y == battleField.array.length - 1) {
            y = (int) (Math.random() * (2)) + (y - 1);
        }
        if (x == battleField.array.length - 1) {
            x = (int) (Math.random() * (2)) + (x - 1);
        }
        if (x > 0 && x <battleField.array.length - 1) {
            x = (int) (Math.random() * (3)) + (x - 1);
        }
        if (y < battleField.array.length - 1 && y > 0) {
            y = (int) (Math.random() * (3)) + (y - 1);
        }
        battleField.array[y][x] = 'Z';
        return battleField.array;
    }

}
