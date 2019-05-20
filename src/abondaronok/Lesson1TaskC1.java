package abondaronok;

public class Lesson1TaskC1 {
    public static void main(String[] args) {
        for (byte i = -128; i < 127; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length()>8) binary=binary.substring(binary.length()-8);
            binary = String.format("%8s", binary).replace(" ", "0");
            String octal = Integer.toOctalString(i);
            if (octal.length()>3) octal=octal.substring(octal.length()-3);
            octal = String.format("%3s", octal);
            String hex = Integer.toHexString(i);
            if (hex.length()>2) hex=hex.substring(hex.length()-2);
            hex = String.format("%2s", hex);
            System.out.printf("%2s %3s %8s %4d %n",hex, octal, binary, i);
        }
    }
}

