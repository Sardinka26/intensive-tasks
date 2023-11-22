package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int age = 91;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age >= 11 && age <= 19 || age == 0 || age % 10 == 0) {
            return " Ваш возраст " + age + " лет";

        } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
            return " Ваш возраст " + age + " года";

        } else if (age % 10 == 1) {
        }
        return " Ваш возраст " + age + " год";
    }
}