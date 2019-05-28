package sshumsky.lesson6.service;

import sshumsky.lesson6.model.Dog;

public interface DogService {
    /**
     *
     * @param first
     * @param second
     * @return boolean {@link sshumsky.lesson6.service.impl.DogServiceImpl}
     */
    Boolean win(Dog first, Dog second);

    void fight();
}
