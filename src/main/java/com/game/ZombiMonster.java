package com.game;

public class ZombiMonster extends MonsterMain{
    private BattleField battleField;
    ZombiMonster (BattleField battleField){
    super (battleField);
    }
    void printMonster() {
        super.printMonster('Z');
    }

}
