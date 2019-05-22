package slesarchyk;

import java.util.Scanner;

public class task31 {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println(sum+" "+sub+" "+mul+" "+div+" "+mod);
        double dsum=(double)a+b;
        double dsub=(double)a-b;
        double dmul=(double)a*b;
        double ddiv=(double)a/b;
        double dmod=(double)a%b;
        System.out.println(dsum+" "+dsub+" "+dmul+" "+ddiv+" "+dmod);
    }

}
