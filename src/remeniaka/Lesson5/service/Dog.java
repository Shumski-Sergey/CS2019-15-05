package remeniaka.Lesson5.service;

public class Dog {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
