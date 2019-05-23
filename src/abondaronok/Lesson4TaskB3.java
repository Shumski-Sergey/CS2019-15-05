package abondaronok;

import java.util.Scanner;

public class Lesson4TaskB3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        input(scan.nextInt());
    }
    private static void input (int a){
        int z = 0;
        int sum = 0;
        String d = "";
        while ( sum < a){
            z++;
            sum = sum + z;
            if ( sum > a){
                break;
            }
            d = d + sum + ", ";
        }
        System.out.println("Output:\n" + d);
    }
}
