package sshumsky.lesson6.model;

public class Dog {
    private String name;
    private double power;
    private int weight;
    private int age;

    public Dog(double power, int weight, int age, String name) {
        this.power = power;
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
