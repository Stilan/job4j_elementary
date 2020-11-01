package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFIO("Федо Федоров");
        student.setGroup(321);
        student.setDateOfReceipt(new Date());
        System.out.println("ФИО " + student.getFIO() + " группа " + student.getGroup() +
                " дата поступления " + student.getDateOfReceipt());
    }
}
