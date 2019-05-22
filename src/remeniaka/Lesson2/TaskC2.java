package remeniaka.Lesson2;
import java.util.Scanner;
public class TaskC2 {

    public static int sumDigitsInnumber(int sum) {
        return sum;
    }

    public static void main(String[] args){

        System.out.println("Enter number");
        Scanner sc= new Scanner (System.in);
        int number = sc.nextInt();
        int sum=0;
        int currentDigit;

        currentDigit= number %10;

        sum = sum + currentDigit;

        number =number/10;

        currentDigit= number %10;

        sum = sum + currentDigit;

        number =number/10;

        currentDigit= number %10;

        sum = sum + currentDigit;

        number =number/10;

        sum = sum+number;

        System.out.println("Result" + sum);
    }}