package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean maxNumber =  left >=  right;
        int result = maxNumber ? left : right;
        return result;
    }

    public  static  int max(int left, int middle, int right) {
        return max(left, max(middle, right));
    }

    public  static  int max(int left, int middle, int center, int right) {
        return max(left, max(middle, center, right));
    }

    public static void main(String[] args) {
        System.out.println(max(6,   10));
        System.out.println(max(321,  5007,  534));
        System.out.println(max(843,  754, 687,  923));
    }
}
