package com.game;

public class Hero {
    private BattleField battleField;
    Hero(BattleField battleField){
        this.battleField=battleField;
    }

    private int x,y;

    public char[][] right() {
        battleField.array [y][x] = ' ';
        if (x <  battleField.array[0].length - 1) {
            x++;
        }
        battleField.array[y][x] = 'X';
        return  battleField.array;
    }

    public char[][] left() {
        battleField.array[y][x] = ' ';
        if (x > 0) {
            x--;
        }
        battleField.array[y][x] = 'X';
        return  battleField.array;
    }

    public char[][] up() {
        battleField.array[y][x] = ' ';
        if (y > 0) {
            y--;
        }
        battleField.array[y][x] = 'X';
        return  battleField.array;
    }

    public char[][] down() {
        battleField.array[y][x] = ' ';
        if (y < battleField.array.length - 1) {
            y++;
        }
        battleField.array[y][x] = 'X';
        return  battleField.array;
    }
}
