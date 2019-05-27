package Romanovskaya.Lesson3;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        convertCelsiumToFahrenheit((int) in.nextDouble());
    }
        private static void convertCelsiumToFahrenheit(int celsium){
            double fahrenheit;
            fahrenheit = (celsium*9/5)+32;
            System.out.println(fahrenheit);
        }

    }


