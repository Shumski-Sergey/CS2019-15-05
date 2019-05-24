package gabrusev.lesson4;


import java.util.Scanner;

public class lesson4_a_2_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b == 1) {
            System.out.print("Понедельник");
        } else if (b == 2) {
            System.out.print("Вторник");
        } else if (b == 3) {
            System.out.print("Среда");
        } else if (b == 4) {
            System.out.print("Четверг");
        } else if (b == 5) {
            System.out.print("Пятница");
        } else if (b == 6) {
            System.out.print("Суббота");
        } else if (b == 7) {
            System.out.print("Воскресенье");
        } else {
            System.out.println("Такого дня недели не существует");
        }
    }
}