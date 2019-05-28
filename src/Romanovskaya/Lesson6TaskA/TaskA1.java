package Romanovskaya.Lesson6TaskA;

public class TaskA1 {

    public static void main(String[] args) {
        Dog dogfirst = new Dog("Sharik", 5 );
        Dog dogsecond = new Dog("Tuzik", 3 );

        String dogfirstName = dogfirst.getName();
        int dogfirstAge = dogfirst.getAge();
        String seconddogName = dogsecond.getName();
        int seconddogAGE = dogsecond.getAge();

        System.out.println(dogfirstName+ " " + dogfirstAge);
        System.out.println(seconddogName + " "+ seconddogAGE);
        System.out.println( dogfirst.toString());
        System.out.println(dogsecond.toString());
    }
}
