package ua.lms.ithillel.yermol.dz7;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Integer, String> map = new HashMap<>();
    static HashMap<Integer, String> map1 = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            inputAndArray();
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

    public static String inputAndArray() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        String[] strA = str.split(" ");
        String name = null;
        int number = 0;
        try {
            name = strA[1];
            number = Integer.parseInt(strA[0]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException a) {
            System.out.println("введите номер и имя игрока!");
            return inputAndArray();
        }
        whoWillGet(name, number);
        return str;  //можно без return, но тогда после ввода ексепшна будет захватывать в ХешМавпу 0 и null(0) из
                    // name и number
    }
}