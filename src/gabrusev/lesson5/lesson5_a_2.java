package gabrusev.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lesson5_a_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        for ( ; ; ){
            String s = read.readLine();
            if (s.equals("end")) {
                break;
            }
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        }
    }

