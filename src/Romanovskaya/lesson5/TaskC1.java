package Romanovskaya.lesson5;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList massiv1 = new ArrayList();
        ArrayList massiv2 = new ArrayList();
        ArrayList massiv3 = new ArrayList();
        for ( int i = 0; i<20; i++){
            int s = sc.nextInt();
            list.add(s);
        }
        for (int i = 0; i<list.size(); i++){
            Integer x = list.get(i);
            if ( x%3 == 0 ){
                massiv1.add(x);
            }
            if (x%2 == 0){
                massiv2.add(x);
            }
            if ( x%2 !=0 && x%3 !=0){
                massiv3.add(x);
            }
        }
        printList1(massiv1);
        printList2(massiv2);
        printList3(massiv3);
    }
    private static void printList1(ArrayList massiv1) {
        for ( int i = 0 ; i <massiv1.size(); i++){
            System.out.print(massiv1.get(i)+ " ");
            System.out.println(" ");
        }
    }

    private static void printList2(ArrayList massiv2) {
        for ( int i = 0; i< massiv2.size(); i++){
            System.out.print(massiv2.get(i)+ " ");
            System.out.println(" ");
        }
    }

    private static void printList3(ArrayList massiv3) {
        for ( int i = 0; i<massiv3.size(); i ++){
            System.out.print(massiv3.get(i)+ " ");
            System.out.println(" ");
        }
    }
}
