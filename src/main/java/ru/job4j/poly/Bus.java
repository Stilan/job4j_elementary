package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Go!!!");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Число пассажиров " + number);

    }

    @Override
    public int fillOut(int liters, int sum) {
        sum = liters * 45;
        return sum;
    }
}
