package com.game;

import jline.console.ConsoleReader;
import jline.console.KeyMap;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConsoleReader reader = new ConsoleReader();
        char[] array = {'-', '-', '-', '-', 'x', '-', '-'};
        while (true) {

            KeyMap map = new KeyMap("");
            map.bind("\u001B[A", "Fire");
            map.bind("\u001B[B", "Down");
            map.bind("\u001B[C", "Right");
            map.bind("\u001B[D", "Left");

            Object action = reader.readBinding(map);
            reader.clearScreen();
            reader.flush();
            if (action.equals("Right")) {
                printArray(right(array), reader);
            }
            if (action.equals("Left")) {
                printArray(left(array), reader);
            }
        }

    }

    public static char[] right(char[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            char temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static char[] left(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static void printArray(char[] array, ConsoleReader reader) throws IOException {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
        }
        reader.print(str);
        reader.flush();
    }

}
