package Romanovskaya.Lesson3;

public class TaskC2 {
    public static void main ( String[] args){
        System.out.println(sumDigitsNumber(5467));
    }
    public static int sumDigitsNumber (int number){
        int sum = 0;
        int currentDigit;
        currentDigit = number%10;
        sum = sum + currentDigit;
        number = number/10;
        currentDigit = number%10;
        sum = sum + currentDigit;
        number = number/10;
        currentDigit = number%10;
        sum = sum + currentDigit;
        number = number/10;
        sum = sum + number;
        return sum;
    }
}
