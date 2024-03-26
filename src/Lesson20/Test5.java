package Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(new String ("poka"));
        list1.add(new String ("privet"));
        list1.add(new String ("ok"));
        list1.add(new String ("poka"));
        list1.add(new String ("hello"));
        for (String s:list1){
            System.out.print(s+ " ");}
        System.out.println(list1.lastIndexOf(new String("poka")));
        System.out.println();
        System.out.println(list1.size());
        System.out.println(list1.contains("poka"));
        System.out.println(list1.toString());
    }
}
