 package npresniakova;

import java.util.Scanner;

public class Lesson4TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три целых числа:");
       int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
       if (a==b && b==c) System.out.println (a+" "+b+" "+c);
       else if (a==b)  System.out.println (a + " "+ b);
       else if (a==c) System.out.println (a + " "+ c);
       else if (b==c) System.out.println (b + " "+ c);
    }
}
