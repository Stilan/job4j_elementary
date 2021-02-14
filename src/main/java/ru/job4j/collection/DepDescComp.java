package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        String  strings_o1 = o1.substring(0,2);
        String strings_o2 = o2.substring(0,2);
        var res = strings_o2.compareTo(strings_o1);
        if (res == 0){
           return res = o1.compareTo(o2);
        }
        return res;
    }
}
