package com.game;

public class Monster extends AbstractMonster {

    Monster(BattleField battleField) {
        super(battleField);
    }

    void printMonster() {
        printMonster('M');
    }

}
