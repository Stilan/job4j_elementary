package ru.job4j.oop;

public class Usage {
    public static void main(String[] args) {
        Vehicle mig = new Airplane();
        Vehicle su = new Airplane();
        Vehicle liaz = new Bus();
        Vehicle paz = new Bus();
        Vehicle teplovoz = new Train();
        Vehicle parovoz = new Train();

        Vehicle[] vehicles = new Vehicle[]{mig, su, liaz, paz, teplovoz, parovoz};
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
             vehicle.move();
        }
    }
}
