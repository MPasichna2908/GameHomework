package com.game;

public class Hero {
    private BattleField battleField;
    private Position position;

    Hero(BattleField battleField, Position position) {
        this.battleField = battleField;
        this.position = position;
    }


    public void moveRight() {
        Position newPosition = new Position(position.getX(), position.getY() + 1);
        position = battleField.moveToPosition(newPosition, position, 'H');
    }

    public void moveLeft() {
        Position newPosition = new Position(position.getX(), position.getY() - 1);
        position = battleField.moveToPosition(newPosition, position, 'H');
    }

    public void moveUp() {
        Position newPosition = new Position(position.getX() + 1, position.getY());
        position = battleField.moveToPosition(newPosition, position, 'H');
    }

    public void moveDown() {
        Position newPosition = new Position(position.getX() - 1, position.getY());
        position = battleField.moveToPosition(newPosition, position, 'H');

    }
}
