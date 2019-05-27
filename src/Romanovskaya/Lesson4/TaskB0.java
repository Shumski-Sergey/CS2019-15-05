package Romanovskaya.Lesson4;

import java.util.Scanner;

public class TaskB0 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int year = scan1.nextInt();
        if (year %4 ==0 && year %100 != 0 ){
            System.out.println("количество дней в году " + year+ ": " + "366");
        }
        else if (year %4 == 0 && year %100 ==0 && year % 400 !=0 ){
            System.out.println("количество дней в году "+ year+ ": " + "365");
        }
        else if ( year % 4==0 && year % 100 == 0 && year %400 == 0){
            System.out.println("количество дней в году " + year+ ": " + "366");
        }
        else {
            System.out.println("количество дней в году " + year + ": " +  "365");
        }
    }
}
