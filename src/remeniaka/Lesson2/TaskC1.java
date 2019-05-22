package remeniaka.Lesson2;
import java.util.Scanner;

public class TaskC1 {

        public static void main(String[] args){
            System.out.println("Enter the Degrees in Celsius");
            Scanner sc= new Scanner (System.in);
            double c = sc.nextDouble();
            double f =0;
            System.out.println("Result" + f);
        }
        public double convertToFahrenheit(double f,double c) {
            f = (c *(9/5)) + 32;
            return f;
        }
    }
}
