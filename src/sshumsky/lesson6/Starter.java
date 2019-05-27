package sshumsky.lesson6;

import sshumsky.lesson6.service.impl.DogServiceImpl;

public class Starter {
    public static void main(String[] args) {
        DogServiceImpl dogService = new DogServiceImpl();
        dogService.fight();
    }
}
