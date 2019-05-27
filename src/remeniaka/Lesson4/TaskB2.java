package remeniaka.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TaskB2 {

    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[20];

        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();

            list[i] = Integer.parseInt(s);

            System.out.println(list.length);

            int[] a = new int[10];
            int[] b = new int[10];

            System.arraycopy (list,0,a,0,10 );

            for (int x = 0; x < list.length; x++);

            System.out.println("a="+ Arrays.toString(a));

            System.arraycopy (list,10,b,0,10 );

            for (int x = 0; x < list.length; x++);

            System.out.println("a="+ Arrays.toString(b));

        }
    }
}
