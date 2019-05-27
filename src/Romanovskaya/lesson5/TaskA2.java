package Romanovskaya.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class TaskA2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Reader r = new InputStreamReader(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (; ;) {
            String last = reader.readLine();
            if (last.equals("END"))
                break;
            list.add(last);
        }
        System.out.println(list);
    }
}
