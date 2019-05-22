package belov;

public class Lesson3TaskB2 {
    public static void main(String[] args) {

        int b, o, h;
        double d, f;
        b = o = h = 111;
        d = f = 111.111;

        d = (int) d;
        b = (byte) 0b111;
        o = Math.toIntExact((long) 0111L);
        h = 0x111;
        f = (float) 111.111f;

        System.out.print(d+" "+b+" "+o+" "+h+" "+f);
    }
}
