package ua.lms.ithillel.yermol.dz7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class homework6_2 {

    public static void main(String[] args) {
        String s1 = typeString();
        String s2 = typeString();
        String s3 = typeString();
        stringToArray(s1, s2, s3);
    }

    public static String typeString() {
        System.out.println("Введите строку: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void stringToArray(String s1, String s2, String s3) {
        HashSet<String> Set1 = new HashSet<String>();
        HashSet<String> Set2 = new HashSet<String>();
        HashSet<String> Set3 = new HashSet<String>();
        String[] wordsOne = s1.split("");
        for (int i = 0; i < wordsOne.length; i++) {
            Set1.add(wordsOne[i]);
        }
        String[] wordsTwo = s2.split("");
        for (int i = 0; i < wordsTwo.length; i++) {
            Set2.add(wordsTwo[i]);
        }
        String[] wordsThree = s3.split("");
        for (int i = 0; i < wordsThree.length; i++) {
            Set3.add(wordsThree[i]);
        }
        Set1.retainAll(Set2);
        Set1.retainAll(Set3);
        System.out.println(Set1);
    }
}
