package Lesson6;

public class MethodOverLoading2 {
    int sum (int i1, int i2){
        return i1+i2;
    }

    String sum (String s1,String s2){
        return s1+s2;
    }

}

class MethodOverLoading2Test{
    public static void main(String[] args) {
        MethodOverLoading2 mO2 = new MethodOverLoading2();
        int a = mO2.sum(5,2);
        System.out.println(a);
        String s = mO2.sum("Privet,", "moy drug");
        System.out.println(s);
    }
}
