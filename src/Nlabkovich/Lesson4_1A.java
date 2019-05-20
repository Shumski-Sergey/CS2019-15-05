package Nlabkovich;

import java.util.Scanner;

public class Lesson4_1A {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число (а)");
        int a = in.nextInt();
        System.out.println("Введите второе число (b)");
        int b = in.nextInt();
        int сумма = a+b;
        int разность = a-b;
        int произведение = a*b;
        int частное = a/b;
        int остаток_от_деления = a%b;
        System.out.println("Сумма" + сумма + "\nРазность - " + разность + "\nПроизвидение - " + произведение + "\nЧастное - " + частное + "\nОстаток от деления - " + остаток_от_деления + "\n");

        double dсумма = a+b;
        double dразность = a-b;
        double dпроизведение = a*b;
        double dчастное = a/b;
        double dостаток_от_деления = a%b;
        System.out.println("Сумма" + dсумма + "\nРазность - " + dразность + "\nПроизвидение - " + dпроизведение + "\nЧастное - " + dчастное + "\nОстаток от деления - " + dостаток_от_деления + "\n");

    }
}