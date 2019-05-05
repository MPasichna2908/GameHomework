package com.game;

import jline.console.ConsoleReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BattleField battleField = new BattleField(10, 10);
        Hero hero = new Hero(battleField, new Position(8, 5));
        Monster monster = new Monster(battleField, new Position(2,1));
        ZombiMonster zombiMonster = new ZombiMonster(battleField, new Position(9,7));

        Engine engine = new Engine(battleField, monster, hero, zombiMonster, new ConsoleReader());
        engine.runGame();
    }
}