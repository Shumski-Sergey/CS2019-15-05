package belov.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Lesson5TaskC2 {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 20 чисел: ");

        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        for (int j = list.size()-1; j >=0; j--) {
            System.out.print(list.get(j) + " ");
        }
    }
}