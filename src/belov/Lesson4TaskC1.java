package belov;

import java.util.Scanner;

public class Lesson4TaskC1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите желаемую заработную плату в $: ");
        int salary = sc.nextInt();
        int bonus = 50;

        if (salary < 300 || salary > 3000) {
            System.out.print("Мы вам перезвоним!");
        } else {
            for (int month = 0; month <= 14; month++) {
                if (month == 0 || month == 13 || month == 14) {
                    nameMonth(month);
                }
                else if (month == 6 || month == 7 || month == 8) {
                    nameMonth(month);
                    System.out.println(salary + "$");
                    if (salary == 666) {
                        break;
                    }
                }
                else {
                    int bonusSalary = salary * (100 + bonus) / 100;
                    nameMonth(month);
                    System.out.println(bonusSalary + "$");
                    if (bonusSalary == 666) {
                        break;
                    }
                }
            }

        }
    }
    private static void nameMonth(int numMonth){
         switch (numMonth) {
            case 1: System.out.print("Ваша зарплата за январь составит: "); break;
            case 2: System.out.print("Ваша зарплата за февраль составит: "); break;
            case 3: System.out.print("Ваша зарплата за март составит: "); break;
            case 4: System.out.print("Ваша зарплата за апрель составит: "); break;
            case 5: System.out.print("Ваша зарплата за май составит: "); break;
            case 6: System.out.print("Ваша зарплата за июнь составит: "); break;
            case 7: System.out.print("Ваша зарплата за июль составит: "); break;
            case 8: System.out.print("Ваша зарплата за август составит: "); break;
            case 9: System.out.print("Ваша зарплата за сентябрь составит: "); break;
            case 10: System.out.print("Ваша зарплата за октябрь составит: "); break;
            case 11: System.out.print("Ваша зарплата за ноябрь составит: "); break;
            case 12: System.out.print("Ваша зарплата за декабрь составит: "); break;
            default: System.out.println("0.0$");

        }
    }
}
