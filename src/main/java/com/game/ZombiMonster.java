package com.game;

public class ZombiMonster extends AbstractMonster {

    ZombiMonster(BattleField battleField, Position position) {
        super(battleField, position);
    }

    void printMonster() {
        super.printMonster('Z');
    }

}
