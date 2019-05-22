package belov;

import java.io.IOException;

public class Lesson4TaskA2 {
    public static void main(String[] args) throws IOException {

            char monthNum;
            System.out.print("Введите номер дня недели: ");
            monthNum = (char) System.in.read();

            switch (monthNum) {
                case '1':
                    System.out.print("Понедельник");
                    break;
                case '2':
                    System.out.print("Вторник");
                    break;
                case '3':
                    System.out.print("Среда");
                    break;
                case '4':
                    System.out.print("Четверг");
                    break;
                case '5':
                    System.out.print("Пятница");
                    break;
                case '6':
                    System.out.print("Суббота");
                    break;
                case '7':
                    System.out.print("Воскресенье");
                    break;
                default:
                    System.out.print("Такого дня не существует");

            }


    }
}
