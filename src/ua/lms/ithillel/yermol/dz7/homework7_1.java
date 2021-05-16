package ua.lms.ithillel.yermol.dz7;

import java.util.HashMap;
import java.util.Scanner;

public class homework7_1 {

    public static void main(String[] args) {
        int number = inputInteger();
        converterToWord(number);
    }

    public static int inputInteger() {
        System.out.println("enter a number 0-9999");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {     //здесь можно зделать try-catch, но я когда сделал,
            return input.nextInt();   // то return показался не таким громоздким и функционала прибавил
        } else {
            return inputInteger();
        }
    }

    public static void converterToWord(int number) {
        HashMap<Integer, String> hashMonkey1000 = new HashMap<>();
        HashMap<Integer, String> hashMonkey100 = new HashMap<>();
        HashMap<Integer, String> hashMonkey10 = new HashMap<>();
        HashMap<Integer, String> hashMonkey11_19 = new HashMap<>();
        HashMap<Integer, String> hashMonkey1 = new HashMap<>();

        hashMonkey1.put(1, "one");
        hashMonkey1.put(2, "two");
        hashMonkey1.put(3, "three");
        hashMonkey1.put(4, "four");
        hashMonkey1.put(5, "five");
        hashMonkey1.put(6, "six");
        hashMonkey1.put(7, "seven");
        hashMonkey1.put(8, "eight");
        hashMonkey1.put(9, "nine");

        hashMonkey11_19.put(1, "eleven");
        hashMonkey11_19.put(2, "twelve");
        hashMonkey11_19.put(3, "thirteen");
        hashMonkey11_19.put(4, "fourteen");
        hashMonkey11_19.put(5, "fifteen");
        hashMonkey11_19.put(6, "sixteen");
        hashMonkey11_19.put(7, "seventeen");
        hashMonkey11_19.put(8, "eighteen");
        hashMonkey11_19.put(9, "nineteen");

        hashMonkey10.put(1, "ten");
        hashMonkey10.put(2, "twenty");
        hashMonkey10.put(3, "thirty");
        hashMonkey10.put(4, "forty");
        hashMonkey10.put(5, "fifty");
        hashMonkey10.put(6, "sixty");
        hashMonkey10.put(7, "seventy");
        hashMonkey10.put(8, "eighty");
        hashMonkey10.put(9, "ninety");

        hashMonkey100.put(1, "one hundred");
        hashMonkey100.put(2, "two hundred");
        hashMonkey100.put(3, "three hundred");
        hashMonkey100.put(4, "four hundred");
        hashMonkey100.put(5, "five hundred");
        hashMonkey100.put(6, "six hundred");
        hashMonkey100.put(7, "seven hundred");
        hashMonkey100.put(8, "eight hundred");
        hashMonkey100.put(9, "nine hundred");

        hashMonkey1000.put(1, "one thousand");
        hashMonkey1000.put(2, "two thousand");
        hashMonkey1000.put(3, "three thousand");
        hashMonkey1000.put(4, "four thousand");
        hashMonkey1000.put(5, "five thousand");
        hashMonkey1000.put(6, "six thousand");
        hashMonkey1000.put(7, "seven thousand");
        hashMonkey1000.put(8, "eight thousand");
        hashMonkey1000.put(9, "nine thousand");

        int units = number % 10;
        int remainderOne = number / 10;
        int dozens = remainderOne % 10;
        int remainderTwo = remainderOne / 10;
        int hundreds = remainderTwo % 10;
        int thousand = remainderTwo / 10;

        if (thousand != 0) {
            System.out.print(hashMonkey1000.get(thousand));
        }
        if (hundreds != 0) {
            System.out.print(" " + hashMonkey100.get(hundreds));
        }
        if (dozens == 1 && units != 0) {
            System.out.println(" " + hashMonkey11_19.get(units));
        }
        if (dozens != 0 && dozens != 1) {
            System.out.print(" " + hashMonkey10.get(dozens));
        }
        if (units != 0 && dozens != 1) {
            System.out.print(" " + hashMonkey1.get(units));
        }
    }
}