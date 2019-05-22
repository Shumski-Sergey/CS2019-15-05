package eyakunin1;

//марс 3.86
//земля 9.81
// 9,81*Н=1кг
// H=1/9.81=0,1019
//

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Les_2_task_c3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Enter Ears human weight, kg:");

        double ew = sc.nextDouble(); // вес на земле
        double mw = ew / 9.81 * 3.86;
        mw = Math.round (mw * 100.0 / 100.0);
        System.out.println(mw);

    }
}