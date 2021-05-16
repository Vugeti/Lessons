package ua.lms.ithillel.yermol.dz7;

import java.util.Scanner;

public class homework7_2 {

    //эту часть сделали вместе с Женей, но решение показалось тривиальным учитывая что мы уже на ХэшьМапах
    public static void main(String[] args) {
        String str = Input();
        CountNull(str);
    }

    public static String Input() {
        System.out.println("enter a number: ");
        Scanner input = new Scanner(System.in);
        if (input.hasNextLine()) {
            return input.nextLine();
        } else {
            return Input();
        }
    }

    public static void CountNull(String str) {
        String[] wordsOne = str.split("");
        int count = 0;
        int counts = 0;
        for (String s : wordsOne) {
            if (s.equals("0")) {
                count++;
            }
        }
        for (int i = wordsOne.length - 1; i > 0; i--) {
            if (wordsOne[i].equals("0")) {
                counts++;
            } else {
                break;
            }
        }
        System.out.println("number of zeros: " + count);
        System.out.println("the number of zeros after the digit: " + counts);
    }
}


