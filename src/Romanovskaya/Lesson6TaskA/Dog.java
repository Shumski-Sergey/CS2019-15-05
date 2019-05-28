package Romanovskaya.Lesson6TaskA;

public class Dog {
    private int age;
    private String name;


    public Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Name: " + this.getName()+ " . " + "Age: " + this.getAge();
    }


}
