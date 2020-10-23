package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price;
        for (int i = 0; i < COINS.length; i++) {
           while (sum - COINS[i] >= 0){
               rsl[size] = COINS[i];
               sum -= COINS[i];
               size ++;
           }
        }
        return Arrays.copyOf(rsl, size);
    }
}
