package npresniakova;

import java.io.IOException;
import java.util.Scanner;

public class Lesson4TaskA2 {
    public static void main(String[] args){
        System.out.println("Введите номер дня недели:");
         Scanner sc = new Scanner(System.in);
         int i = sc.nextInt();
        switch (i){
            case 1: System.out.println("понедельник"); break;
            case 2: System.out.println("вторник"); break;
            case 3: System.out.println("среда"); break;
            case 4: System.out.println("четверг"); break;
            case 5: System.out.println("пятница"); break;
            case 6: System.out.println("суббота"); break;
            case 7: System.out.println("воскресенье"); break;
            default: System.out.println("такого дня недели не существует"); break;
        }
    }
}


