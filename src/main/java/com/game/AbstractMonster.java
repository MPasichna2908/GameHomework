package com.game;

import java.util.Random;

public class AbstractMonster {
    private BattleField battleField;
    private Position position;
    private Random random = new Random();

    AbstractMonster(BattleField battleField, Position position) {
        this.battleField = battleField;
        this.position = position;
    }

    public void printMonster(char symbol) {
        Position newPosition = null;
        int nextInt = random.nextInt(4);
        if (nextInt == 0) {
            newPosition = new Position(position.getX(), position.getY() + 1);
        } else if (nextInt == 1) {
            newPosition = new Position(position.getX(), position.getY() - 1);
        } else if (nextInt == 2) {
            newPosition = new Position(position.getX() + 1, position.getY());
        } else if (nextInt == 3) {
            newPosition = new Position(position.getX() - 1, position.getY());
        }

        position = battleField.moveToPosition(newPosition, position, symbol);
    }
}
