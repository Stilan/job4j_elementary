package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {

        boolean maxNumber =  left >=  right;
        int result = maxNumber ? left :right ;
        return result;
    }

    public static void main(String[] args) {

        System.out.println(max(6,10));
    }
}
