package com.game;

import jline.console.ConsoleReader;
import jline.console.KeyMap;

import java.io.IOException;

public class Engine {

    private ConsoleReader reader;
    private BattleField battleField;
    private Monster monster;
    private ZombiMonster zombiMonster;
    private Hero hero;

    public Engine(BattleField battleField, Monster monster, Hero hero, ZombiMonster zombiMonster, ConsoleReader consoleReader) throws IOException {
        this.battleField = battleField;
        this.monster = monster;
        this.hero = hero;
        this.zombiMonster = zombiMonster;
        this.reader = consoleReader;
    }

    public void runGame() throws IOException {
        while (true) {

            KeyMap map = new KeyMap("");
            map.bind("\u001B[A", "Up");
            map.bind("\u001B[B", "Down");
            map.bind("\u001B[C", "Right");
            map.bind("\u001B[D", "Left");

            Object action = reader.readBinding(map);
            reader.clearScreen();
            reader.flush();


            if (action.equals("Up")) {
                hero.moveUp();
            }
            if (action.equals("Down")) {
                hero.moveDown();
            }
            if (action.equals("Right")) {
                hero.moveRight();
            }
            if (action.equals("Left")) {
                hero.moveLeft();
            }
            String view = battleField.printArray();
            reader.print(view);
            reader.flush();

            monster.printMonster();
            zombiMonster.printMonster();

        }
    }
}
