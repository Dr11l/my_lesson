package Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder ("poka"));
        list1.add(new StringBuilder ("privet"));
        list1.add(new StringBuilder ("ok"));
        list1.add(new StringBuilder ("hello"));
        System.out.println(list1.toString());
    }
}
