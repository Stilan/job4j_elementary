package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException{
        int rsl = -1;
        /* for-each */
        int index = 0;
        for (String v : value) {
          if (key.equals(v)){
              rsl = index;
              break;
          }
            index++;
        }
        if (rsl == -1){
            throw new ElementNotFoundException("Элемент не найден");
        }
        return rsl;
    }
    public static void main(String[] args) {
        String[] array = {"EEE","WWW","QQQ"};
        String key = "WWW";
        try {
            System.out.println(indexOf(array,key));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
