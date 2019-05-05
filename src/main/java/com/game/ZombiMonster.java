package com.game;

public class ZombiMonster extends AbstractMonster {

    ZombiMonster(BattleField battleField) {
        super(battleField);
    }

    void printMonster() {
        super.printMonster('Z');
    }

}
