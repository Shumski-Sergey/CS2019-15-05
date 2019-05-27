package Romanovskaya.lesson5;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TaskB {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList array = new ArrayList();
        for (int i = 0; i < 20; i++) {
            String value = scanner.nextLine();
            int x = Integer.parseInt(value);
            array.add(x);
        }
        ArrayList arrayfirst = new ArrayList();
        int k;
        for (k = 0; k < 10; k++) {
            arrayfirst.add(k);
            Collections.addAll(arrayfirst);
        }
        ArrayList arraysecond = new ArrayList();
        int m;
        for ( m = 10 ; m<20; m++){
            arraysecond.add(m);
            Collections.addAll(arraysecond);
        }

            System.out.println("a=" + arrayfirst);
            System.out.println("b=" +  arraysecond);
        }
    }


