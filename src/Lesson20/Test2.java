package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder ("poka"));
        list1.add(new StringBuilder ("privet"));
        list1.add(new StringBuilder ("ok"));
        list1.add(1,new StringBuilder ("hello"));
        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }

        System.out.println();
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder ("Petrov"));
        list2.add(new StringBuilder ("Sidorov"));
        list1.addAll(list2);

        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }
        list2.get(1).append("!");
        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }
    }

}
