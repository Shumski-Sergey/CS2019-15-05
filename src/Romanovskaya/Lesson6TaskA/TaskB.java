package Romanovskaya.Lesson6TaskA;

public class TaskB {
    public static void main(String[] args) {
       Dog[] d = new Dog[5];
       d[0]= new Dog(); d[0].setName("Шарик"); d[0].setAge(1);
       d[1]= new Dog(); d[1].setName("Жучка"); d[1].setAge(2);
        d[2]= new Dog(); d[2].setName("Бобик"); d[2].setAge(3);
        d[3]= new Dog(); d[3].setName("Барбос"); d[3].setAge(4);
        d[4]= new Dog(); d[4].setName("Полкан"); d[4].setAge(5);
        DogHelper.printAllNames(d);
        System.out.println();
        System.out.println(DogHelper.averageAge(d));

    }
}
