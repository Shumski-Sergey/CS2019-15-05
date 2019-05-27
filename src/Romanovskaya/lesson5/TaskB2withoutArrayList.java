package Romanovskaya.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class TaskB2withoutArrayList {
    public static void main(String[] args) throws IOException {
        int [] mass20 = new int[20];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for ( int i = 0; i< mass20.length; i++){
            String number = read.readLine();
            mass20[i]=Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(mass20));
        int [] massfirst10 = new int[10];
        int [] masssecond10 = new int[10];
        for ( int i =0; i<20; i++) {
            if (i < 10) {
                massfirst10[i] = mass20[i];
            } else {
                masssecond10[i - 10] = mass20[i];
            }
        }
        System.out.println(Arrays.toString(massfirst10));
        System.out.println(Arrays.toString(masssecond10));

  }

}
