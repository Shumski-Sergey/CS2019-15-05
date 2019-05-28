package belov.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lesson5TaskB1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList<>();

        for (int i=1; i <= 5; i++){
            String text = reader.readLine();
            list.add(text);
        }

        int size = list.size();
        System.out.println("Размер: " + size);

        for (String s: list) {
            System.out.println(s);
        }

    }
}
