package Romanovskaya.Lesson3;

public class TaskB2 {
    public static void main(String[] args) {
        double d = (int)111.111;
        byte b = 111;
        long o = 111;
        int h = 111;
        float f = (float) 111.111;

        int k = b;

        String Binb = Integer.toBinaryString(k);
        String Hexh = Long.toHexString(h);
        String Okto = Integer.toOctalString(Math.toIntExact(o));
        System.out.println(d + " "+ Binb + " " + Okto + " " + Hexh + " " + f);




    }
}
