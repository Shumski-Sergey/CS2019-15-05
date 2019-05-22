package remeniaka.Lesson2;

import java.util.Scanner;

public class TaskB1 {

    public static void main(String[] args){

        System.out.println("Введите число:");

        Scanner sc= new Scanner (System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        double d =0;
        d=b*b-4*a*c;
        if (d>0 ){
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        if (d==0 ){
            double x1;
            x1=-b/ (2*a);
            System.out.println("Корни уравнения: x1 = " + x1 );
        }
        if (d<0 ){
            System.out.println("Уровнения корней не  имеет)" );
        }}}