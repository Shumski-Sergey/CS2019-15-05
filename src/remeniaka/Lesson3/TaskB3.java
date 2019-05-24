package remeniaka.Lesson3;

import java.util.Scanner;


public class TaskB3 {

    public static void main(String[] args) {

        System.out.println("Enter number");
        Scanner sc= new Scanner (System.in);
        int a = sc.nextInt();
        sc.close();

        int i=0;

        int sum=0;


        for (;;){
            sum +=i++;

            {

                System.out.println("сумма#" + sum);
                {
                    if (sum>=a)break;
                }}
        }}}