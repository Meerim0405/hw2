package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageTemp(7, 20));
        System.out.println(ageTemp(36, 26));
        System.out.println(ageTemp(17, -18));
        System.out.println(ageTemp(77, 33));
        System.out.println(ageTemp(45, -20));
    }

    public static String ageTemp(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}
