package gabrusev.lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class lesson5_c_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mass = new ArrayList();
        ArrayList mass3 = new ArrayList();
        ArrayList mass2 = new ArrayList();
        ArrayList massOther = new ArrayList();
        for (int i = 0; i < 20; i++) {
            int s = sc.nextInt();
            mass.add(s);
        }

        for (int i = 0; i < mass.size(); i++) {
            Integer x = mass.get(i);
            if (x%3 == 0) {
                mass3.add(x);
            }
            if (x%2 == 0) {
                mass2.add(x);
            }
            if (x%2 !=0 && x%3 != 0) {
                massOther.add(x);
            }
        }
        printList1(mass3);
        printList2(mass2);
        printList3(massOther);
    }

    private static void printList1(ArrayList mass3) {
        System.out.println("mass3 =");
        for (int i = 0; i < mass3.size(); i++){
            System.out.println(mass3.get(i));
        }
    }
    private static void printList2(ArrayList mass2) {
        System.out.println("mass 2 =");
        for (int i = 0; i < mass2.size(); i++){
            System.out.println(mass2.get(i));
        }
    }
    private static void printList3(ArrayList massOther) {
        System.out.println("massOther =");
        for (int i = 0; i < massOther.size(); i++){
            System.out.println(massOther.get(i));
        }
    }
}
