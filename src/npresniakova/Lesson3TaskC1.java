package npresniakova;

public class Lesson3TaskC1 {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        int TC = 40;
        double TF = TC * 9/5 +32;

        return TF;

    }
}
