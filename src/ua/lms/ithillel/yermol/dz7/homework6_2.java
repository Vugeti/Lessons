package ua.lms.ithillel.yermol.dz7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class homework7_2 {

    public static void main(String[] args) {

        String s1 = typeString();
        String s2 = typeString();
        String s3 = typeString();
        set(s1);
        set(s2);
        set(s3);
        HashSet<String> Set1 = set();
        HashSet<String> Set2 = set();
        HashSet<String> Set3 = set();
        Set1.retainAll(Set2);
        Set1.retainAll(Set3);
        System.out.println(Set1);
    }

    public static void sss(HashSet<String> set) {
        HashSet s = set;


    }

    public static String typeString() {
        System.out.println("Введите строку: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static HashSet<String> set(String str) {
        String[] wordsArray = str.split("");
        for (int i = 0; i < wordsArray.length; i++) {
            set.add(wordsArray[i]);
        }return set;
    }
}