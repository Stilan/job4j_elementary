package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String FIO;
    private int group;
    private Date dateOfReceipt;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        FIO = FIO;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(Date dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }
}
