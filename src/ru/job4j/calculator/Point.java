package ru.job4j.calculator;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 3, -1, -9);
        double result3 = Point.distance(3, 5, -2, 0);
        double result4 = Point.distance(8, 8, -3, -9);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 3) to (-1, -9) " +  result2);
        System.out.println("result (3, 5) to (-2, 0) " +  result3);
        System.out.println("result (8, 8) to (-3, -9) " +  result4);

    }
}
