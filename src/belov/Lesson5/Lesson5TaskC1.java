package belov.Lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson5TaskC1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <> ();
        System.out.print("Введите 20 чисел: ");

        for (int i = 0; i < 20; i++){
            int num = scanner.nextInt();
            list.add(num);
        }

        ArrayList <Integer> listFor3 = new ArrayList<>();
        ArrayList <Integer> listFor2 = new ArrayList<>();
        ArrayList <Integer> listForRest = new ArrayList<>();

        for (int x : list) {
            if (x%3==0 && x%2==0) {
                listFor3.add(x);
                listFor2.add(x);
            }
            else if (x%3==0) {
                listFor3.add(x);
            }
            else if (x%2==0) {
                listFor2.add(x);
            }
            else {
                listForRest.add(x);
            }
        }

        printList(listFor3);
        printList(listFor2);
        printList(listForRest);


    }

    private static void printList (List<Integer> list) {
        for (int y: list) {
            System.out.println(y);
        }
    }
}
