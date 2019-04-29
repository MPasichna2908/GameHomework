package com.game;

import jline.console.ConsoleReader;
import jline.console.KeyMap;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ConsoleReader reader = new ConsoleReader();

        BattleField BF=new BattleField();
        Hero hero=new Hero(BF);

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
                hero.up();
            }
            if (action.equals("Down")) {
                hero.down();
            }
            if (action.equals("Right")) {
                hero.right();
            }
            if (action.equals("Left")) {
                hero.left();
            }
            BF.printArray( reader);
            BF.printMonster();
        }
    }



}