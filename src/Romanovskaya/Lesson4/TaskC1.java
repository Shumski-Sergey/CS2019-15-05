package Romanovskaya.Lesson4;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Какую вы хотите зарплату в $$$?");
        int salary = scan1.nextInt();
        if (salary < 300) {
            System.out.println("Мы вам перезвоним");
        }
        if (salary > 3000) {
            System.out.println("Мы вам перезвоним!");
        } else {
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Выберете номер меяца");
            int month = scan1.nextInt();

            for (month = 1; month < 6; month++) {
                System.out.println(salary + (salary * 0.5));
            }
                for (month = 6; month <7; month++) {
                    System.out.println(salary + "Июнь");
                }
                for (month = 7; month < 8; month++) {
                    System.out.println(salary + "Июль");
                }
                for (month = 8; month < 9; month++) {
                    System.out.println(salary + "Август");
                }
                for (month = 9; month < 13; month++) {
                    System.out.println(salary + (salary * 0.5));
                }
                for (month = 0; month < 1; month++) {
                    System.out.println("0$");
                }
                for (month = 13; month < 15; month++) {
                    System.out.println("0$");
                }

            }
        }
    }


