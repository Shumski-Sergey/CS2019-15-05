package abondaronok;

import java.util.Scanner;

public class Lesson4TaskB2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество столбцов и строк:");
        vvod(scan.nextInt(), scan.nextInt());
    }
    private static void vvod (int a, int b){
        int i = 1;
        int z = 1;
        String d = "";
        while(z <= b ){
            d = d + i + " ";
            if (i / a == z ){
                d = d + "\n";
                z ++;
                i = 0;
            } i = i + z;
         }
        System.out.println(d);
    }

}


