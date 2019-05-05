package com.game;

public class Monster extends AbstractMonster {
    private BattleField battleField;

    Monster(BattleField battleField) {
        super(battleField);
    }

    void printMonster() {
        printMonster('M');
    }

}
