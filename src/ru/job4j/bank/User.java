package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс User описывает модель пользователя банка
 * @author Litvinov Alexander
 * @version 1.0
 */
public class User {
    /**
     * Хранение passport осуществляется в переменой типа String
     * Хранение username осуществляется в переменой типа String
     */
    private String passport;
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getPassport() {
        return passport;
    }

    /**
     *
     * @param passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
