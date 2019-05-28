package Romanovskaya.Lesson6TaskA;

public class TaskA1 {

    public static void main(String[] args) {
        Dog dogfirst = new Dog();
        Dog dogsecond = new Dog();
        dogfirst.setName("Шарик");
        dogfirst.setAge(5);
        dogsecond.setName("Тузик");
        dogsecond.setAge(3);

        System.out.println(dogfirst.getName()+ " " + dogfirst.getAge());
        System.out.println(dogsecond.getName() + " "+ dogsecond.getAge());
        System.out.println( dogfirst.toString());
        System.out.println(dogsecond.toString());
    }
}
