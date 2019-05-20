package gabrusev.lesson2;

import java.util.Scanner;

public class Home_work_c_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int earthWeight = sc.nextInt();
        System.out.printf("%.2f", getWeight(earthWeight));

    }

    private static double getWeight(double earthWeight) {
        return (3.86 / 9.81) * earthWeight;
    }
}