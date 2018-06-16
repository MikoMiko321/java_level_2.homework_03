package java_level_2.homework_03;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        String[] myAnimals = new String[] {"cat","dog","mouse","cat","cat","dog","crab",
                "horse","chicken","hippo","giraffe","elephant","tiger"};
        System.out.println(Arrays.toString(myAnimals));
        //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Set<String> mySet = new HashSet<String>(Arrays.asList(myAnimals));
        System.out.println(mySet);
        //Посчитать сколько раз встречается каждое слово.
        List<String> myList = new ArrayList<String>(Arrays.asList(myAnimals));
        for(String s: mySet){
            System.out.println(s+" : "+Collections.frequency(myList, s));
        }
    }
}
