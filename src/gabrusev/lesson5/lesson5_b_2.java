package gabrusev.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class lesson5_b_2 {
    public static void main(String[] args) throws IOException {
        int [] mass20 = new int [20];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mass20.length; i++){
            String number = read.readLine();
            mass20[i] = Integer.parseInt(number);
        }
        System.out.println("mass20 = " + Arrays.toString(mass20));
        int [] mass10_1 = new int [10];
        int [] mass10_2 = new int [10];
        for (int i = 0; i < 20; i++){
            if (i < 10) {
                mass10_1[i] = mass20[i];
            } else {
                mass10_2[i-10] = mass20[i];
            }
        }
        System.out.println("mass10_1 = " + Arrays.toString(mass10_1));
        System.out.println("mass10_2 = " + Arrays.toString(mass10_2));
    }
}