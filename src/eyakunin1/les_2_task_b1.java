package eyakunin1;

import java.util.Scanner;

public class les_2_task_b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какое число возводим в квадрат?:");
        int a = sc.nextInt();
        sc.close();
        System.out.print( a + " в квадрате = " + a*a);

    }
}
