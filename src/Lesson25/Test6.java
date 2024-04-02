package Lesson25;

public class Test6 {
    public static void main(String[] args) {
//        byte b = 10;
//        int a = b;
////        System.out.println(7);
//        final int i1 = 3;
//        short s2 = i1;
//        byte b2= 127;
//        short s1 = -6;
//        char c1 = 100;
//        long l1 = 1;
//        int i2 =(int) l1;
//
//        int i10 = 10000;
//        short s3=(short) i10;
////        System.out.println(s3);
//        char c3 =(char)-8;
//        System.out.println(c3);
//        boolean b10 = true;
////        int i11=(int) b10;
//        int i12=(int) 3.14;
//        System.out.println(i12);
//        double d = 371831.31;
//        byte b12 =(byte) d;
//        System.out.println(b12);
//            int i = 2147483647;
//        System.out.println(i+2);
        int i =5;
        long l =10;
        i= (int) (i*l); // используется кастинг (int)
        i*=l;   // кастинг происходит автоматически
//        System.out.println(i);

        float f = 3.14f;
        int i2=10;
//        System.out.println(i2+f);

        byte b = 3;
        short s =4;
        char c = 5;
//        System.out.println(b+s+c);
//        System.out.println(b++);

        byte b2 =10;
        float f2= 7;
        double d2= 2.0;
//        System.out.println(b2+f2-d2);



        double d10=3.14;
        float f10=6.28f;
        double d11 = d10+f10;
        System.out.println(d11);

        float f11=0*1.5f;
        float f12=0*(float)1.5;



    }
}
