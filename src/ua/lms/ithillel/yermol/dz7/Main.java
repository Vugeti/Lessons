package ua.lms.ithillel.yermol.dz7;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Integer, String> map = new HashMap<>();
    static HashMap<Integer, String> map1 = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            try {
                inputAndArray();
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException a) {
            }
            System.out.println("введите номер и имя игрока!");
        }
    }

    private static void whoWillGet(String name, int number) {
        map1.put(number, name);
        if (map.containsKey(number)) {
        } else {
            map.put(number, name);
        }
        System.out.println("Игроки попросившие номер песледними: " + map1.toString());
        System.out.println("Игроки попросившие номер первыми: " + map.toString());
    }

    public static void inputAndArray() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        String[] strA = str.split(" ");
        String name = strA[1];
        int number = Integer.parseInt(strA[0]);
        whoWillGet(name, number);
    }
}