package remeniaka.Lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        ArrayList<String> array= new ArrayList <>();
        for (;;){
            String value = sc.next();

            if (value.equals("END"))

                break;

        array.add(value);
        }


        System.out.println(array);



}
}
