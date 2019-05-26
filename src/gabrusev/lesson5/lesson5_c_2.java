package gabrusev.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson5_c_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            String x = read.readLine();
            numbers[i] = Integer.parseInt(x);
        }

        int t;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j >= i; j--) {
                if (numbers[j-1] < numbers[j]){
                t = numbers[j - 1];
                numbers[j - 1] = numbers[j];
                numbers[j] = t;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
        }
    }
}
