package com.game;

public class Monster extends AbstractMonster {

    Monster(BattleField battleField, Position position) {
        super(battleField, position);
    }

    void printMonster() {
        printMonster('M');
    }

}
