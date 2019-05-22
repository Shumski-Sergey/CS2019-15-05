package belov;

import java.util.Scanner;

public class Lesson2TaskC3 {

    public static double getWeight(int massOnEarth) {
        double accelerationOnEarth = 9.81;
        double accelerationOnMars  = 3.86;
        double weightOnEarth, weightOnMars, weightIndex, massOnMars;

        weightOnEarth = massOnEarth * accelerationOnEarth;
        weightOnMars  = massOnEarth * accelerationOnMars;
        weightIndex   = weightOnEarth / weightOnMars;
        massOnMars	  = massOnEarth / weightIndex;

        return massOnMars;
    }

    public static void main(String[] args) {

        double massOnMars = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваш вес:");
        int massOnEarth = sc.nextInt();
        massOnMars  = getWeight(massOnEarth);
        massOnMars  = (double) Math.round(massOnMars*100)/100;
        System.out.print("Ваш вес на Марсе составляет: " + massOnMars);
    }
}
