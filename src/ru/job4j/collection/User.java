package ru.job4j.collection;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        if (!name.equals(o.name)){
            return name.compareTo(o.name);
        }else {
            return Integer.compare(age,o.age);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
           User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
