package ua.lms.ithillel.yermol.dz7;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            inputAndArray();
        }
    }

    public static void whoWillGet(String name, int number) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> map1 = new HashMap<>();

//        try {
            map1.put(number, name);
            if (map.containsKey(number)) {
            } else {
                map.put(number, name);
            }
            System.out.println("Игроки попросившие номер песледними: " + map1.toString());
            System.out.println("Игроки попросившие номер первыми: " + map.toString());
//        } catch (ArrayIndexOutOfBoundsException | NumberFormatException a) {
//        }

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

