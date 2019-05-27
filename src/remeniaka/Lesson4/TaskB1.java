package remeniaka.Lesson4;

import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args){
        ArrayList list=new ArrayList();

        list.add("May");
        list.add("June");
        list.add("July");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }} }