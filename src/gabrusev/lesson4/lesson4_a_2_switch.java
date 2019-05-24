package gabrusev.lesson4;

import java.io.IOException;

public class lesson4_a_2_switch {
    public static void main(String[] args)
            throws IOException {
        int b = System.in.read();
            switch (b) {
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
                    System.out.println("Такого дня недели не существует");
                    break;
            }
        }
    }