package Romanovskaya.lesson5;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            String value = scanner.nextLine();
            array.add(value);
        }
        System.out.println(array.size());

        for (String element : array) {
            System.out.println(element);

        }
    }
}
