package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
         autos.add("Лада");
         autos.add("БМВ");
         autos.add("Вольва");
         autos.add("Тойота");
        for (String str:autos) {
            System.out.println(str);
        }
    }
}
