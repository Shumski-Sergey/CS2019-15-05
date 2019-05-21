package belov;

public class Lesson3TaskB2 {
    public static void main(String[] args) {

        long b, o, h;
        float d, f;
        b = o = h = 111;
        d = f = (float) 111.111;

        d = (int) d;
        b = (byte) 0b111;
        o = 0111;
        h = 0x111;
        f = (float) 111.111;

        System.out.print(d+" "+b+" "+o+" "+h+" "+f);
    }
}
