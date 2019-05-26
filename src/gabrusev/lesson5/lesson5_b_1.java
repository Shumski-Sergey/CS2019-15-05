package gabrusev.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lesson5_b_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        for (int i = 0; i < 5; i++){
        String s = read.readLine();
        list.add(s);
        }
        System.out.println(list.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
