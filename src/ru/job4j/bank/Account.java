package ru.job4j.bank;

import java.util.Objects;
/**
 * класс Account это модель банк.счета
 * модель имеет поля баланс и реквизиты
 * @author Litvinov Alexander
 * @version 1.0
 */
public class Account {
    /**
     * Хранение requisite осуществляется в переменой типа String
     * Хранение balance осуществляется в переменой типа double
     */
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Реквезиты счета
     * @return Текущие значения реквезитов
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Реквезиты счета
     * @param requisite новое значения
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Боланс счета
     * @return Текущие значения баланса
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Боланс счета
     * @param balance новое значения
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
