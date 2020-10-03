package ru.job4j.calculator;

public class SqArea {
    public static double square(int p, int k) {
        double h = (double) p / (2 * (k + 1));
        double l = h * k;
        double rsl;
        return  rsl = l * h;

    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        double result2 = SqArea.square(6, 4);
        System.out.println(" p = 6, k = 4, s = 2, real = " + result2);
        double result3 = SqArea.square(6, 3);
        System.out.println(" p = 6, k = 3, s = 2, real = " + result3);
    }
}
