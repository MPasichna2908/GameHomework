package com.game;

import jline.console.ConsoleReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BattleField battleField = new BattleField();
        Hero hero = new Hero(battleField, new Position(8, 5));
        Monster monster = new Monster(battleField);
        ZombiMonster zombiMonster = new ZombiMonster(battleField);

        Engine engine = new Engine(battleField, monster, hero, zombiMonster, new ConsoleReader());
        engine.runGame();
    }
}