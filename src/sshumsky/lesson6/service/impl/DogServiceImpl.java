package sshumsky.lesson6.service.impl;

import sshumsky.lesson6.model.Dog;
import sshumsky.lesson6.service.DogService;

public class DogServiceImpl implements DogService {
    @Override
    public Boolean win(Dog first, Dog second) {
        return getChanceDog(first) > getChanceDog(second);
    }

    private double getChanceDog(Dog dog) {
        return 0.2 * dog.getAge() + 0.3 * dog.getWeight() + 0.5 * dog.getPower();
    }

    public void fight() {
        Dog firstDog = new Dog(4.0, 40, 7, "Juchka");
        Dog secondDog = new Dog(0.0, 50, 4, "Strelka");
        System.out.print("Win name: " + (win(firstDog, secondDog) ? firstDog.getName() : secondDog.getName()));
    }
}
