package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] strings_o1 ;
        String[] strings_o2 ;
        strings_o1 = o1.split("/");
        strings_o2 = o2.split("/");
        int res = strings_o1[0].compareTo(strings_o2[0]);
        if (res == 0){
            res = o1.compareTo(o2);
            if (res == 0){
                for (int i = 0; i < strings_o1.length; i++) {
                    res = strings_o1[i].compareTo(strings_o2[i]);
                    if (res != 0){
                        return res;
                    }
                }
            }
        }


        return res;
    }
}
