package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int age =0;
        int rezult2 = 31 %100;
        System.out.println(getAgeString(age));
        System.out.println(rezult2);
    }

    static String getAgeString(int age) {
        String answerAge = " Ваш возраст ";
        int result = age % 100;

        if (result >= 5 && result <= 20 || result == 0) {
            return answerAge + age + " лет";
        }
        if (result >= 2 && result <= 4) {
            return answerAge + age + " года";

        } else if (result == 1) {
            return answerAge + age + " год";
        }
        return answerAge + age + " год";
    }
}



