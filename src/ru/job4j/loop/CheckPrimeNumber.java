package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {

        boolean prime = true;
        int i = 2;
        if (number==1) {
            prime = false;

        }else {
            while (i <= number - 1) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
        }
        return prime;
    }
}