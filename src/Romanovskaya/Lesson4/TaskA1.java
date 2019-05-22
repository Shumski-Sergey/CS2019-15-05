package Romanovskaya.Lesson4;

import java.util.Scanner;

public class TaskA1 {
   public static void main(String [] args){
       Scanner scan1 = new Scanner(System.in);
       int i = scan1.nextInt();
           if (i==1){
               System.out.println("Понедельник");
           }
           else if (i==2){
               System.out.println("Вторник");
           }
           else if (i==3){
               System.out.println("Среда");
           }
           else if (i==4){
               System.out.println("Четверг");
           }
           else if (i==5){
               System.out.println("Пятница");
           }
           else if (i==6){
               System.out.println("Суббота");
           }
           else if (i==7){
               System.out.println("Воскреенье");
           }
           else {
               System.out.println("Такого дня недели не существует!");
           }

       }

   }


