package belov.Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lesson5TaskA2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();

        while (true) {
            String s = reader.readLine();
            if (s.equals("END")) {
                break;
            }
            list.add(s);
        }
        System.out.print(list);

    }
}



