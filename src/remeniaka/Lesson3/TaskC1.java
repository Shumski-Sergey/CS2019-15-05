package remeniaka.Lesson3;

import java.util.Scanner;


public class TaskC1 {
    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner sc= new Scanner (System.in);
        int a = sc.nextInt();
        int month;
        int result= a+(a/2);

        if (a<=300|| a>3000)
        {
            System.out.println ("мы вам перезваним");

        }
        if (a>=300|| a<=3000)
        {
            {for (month=0;month<15;month++) {

                if (a==666)break;

                System.out.println ("заработная плата"+" "+ a);
                {

                    if (month>12)
                    {
                        System.out.println ("заработная плата в 13,14 месяц" +" "+"0");

                        {
                            if (6 <=month || month<=9)

                                System.out.println ("заработная плата летом" +" "+ result);


                        }
                    }

                }}}}}               }
