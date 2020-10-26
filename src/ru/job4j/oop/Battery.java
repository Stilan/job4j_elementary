package ru.job4j.oop;

import ru.job4j.oop.*;
public class Battery {
    private  int load;

    public Battery(int power){
        this.load = power;
    }
    public void exchange(Battery another){
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(80);
        Battery battery2 = new Battery(15);
        System.out.println("battery1 power " + battery1.load + " battery2 power " + battery2.load);
        battery2.exchange(battery1);
        System.out.println("battery1 power " + battery1.load + " battery2 power " + battery2.load);
    }

}
