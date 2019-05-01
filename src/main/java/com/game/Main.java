package com.game;

import jline.console.ConsoleReader;
import jline.console.KeyMap;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       // ConsoleReader reader = new ConsoleReader();

        BattleField battleField=new BattleField();
        Hero hero=new Hero(battleField);
        Monster monster=new Monster(battleField);
        ZombiMonster zombiMonster=new ZombiMonster(battleField);

       Engine engine=new Engine(battleField,monster,hero, zombiMonster);
       engine.runGame();
    }
}