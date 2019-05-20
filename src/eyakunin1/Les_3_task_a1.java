package eyakunin1;

import java.util.Scanner;

public class Les_3_task_a1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print ((a+b) + " " + (a-b) + " " + (a*b) + " " + (a/b) + " " + (a%b));
        System.out.print (" ");
        System.out.print((double)(a+b) + " " + (double)(a-b) + " "
                        + (double)(a*b) + " " + (double)(a/b) + " " + (double)(a%b));

         }
}
