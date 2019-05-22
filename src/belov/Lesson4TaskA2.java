package belov;

import java.util.Scanner;

public class Lesson4TaskA2 {
    public static void main(String[] args){

            int dayNum;
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите номер дня недели: ");
            dayNum = sc.nextInt();

            switch (dayNum) {
                case 1:
                    System.out.print("Понедельник");
                    break;
                case 2:
                    System.out.print("Вторник");
                    break;
                case 3:
                    System.out.print("Среда");
                    break;
                case 4:
                    System.out.print("Четверг");
                    break;
                case 5:
                    System.out.print("Пятница");
                    break;
                case 6:
                    System.out.print("Суббота");
                    break;
                case 7:
                    System.out.print("Воскресенье");
                    break;
                default:
                    System.out.print("Такого дня не существует");

            }


    }
}
