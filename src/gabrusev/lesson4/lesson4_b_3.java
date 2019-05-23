package gabrusev.lesson4;


import java.util.Scanner;

public class lesson4_b_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        int number = sc.nextInt();
        int i = 1;
        while ((j+i) < number) {
                j += i;
                System.out.print(j+",");
                i++;
        }
    }
}
