package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        while (amount > 0) {
            amount = amount + (int) (amount * percent);
            amount = amount - salary;
            year++;
        }
        return year;
    }
}
