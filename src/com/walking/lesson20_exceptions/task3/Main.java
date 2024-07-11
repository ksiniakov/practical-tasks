package com.walking.lesson20_exceptions.task3;

import com.walking.lesson20_exceptions.task3.exeption.ArrayValidationException;
import com.walking.lesson20_exceptions.task3.exeption.UnknownAnimalException;
import com.walking.lesson20_exceptions.task3.model.Animal;
import com.walking.lesson20_exceptions.task3.model.Cat;
import com.walking.lesson20_exceptions.task3.model.Cow;
import com.walking.lesson20_exceptions.task3.model.Dog;

import java.util.concurrent.ExecutionException;

/**
 * Реализуйте любой из вариантов задачи в уроке 18.
 * Для ситуации, когда тип животного неизвестен, выбрасывайте собственное исключение UnknownAnimalException.
 * Предка исключения определите самостоятельно.
 * <p>
 * Также предусмотрите валидацию массива животных на содержание пустых элементов.
 * Если таковые существуют – бросьте кастомное исключение ArrayValidationException,
 * которое содержит информацию об индексе массива, содержащем null.
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow(), new Animal("1")};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                throw new ArrayValidationException("Empty data in %d element");
            }

            sound(animals[i]);
        }
    }

    private static void sound(Animal animal) {

        if (animal.getClass().equals(Cat.class)) {
            ((Cat) animal).meow();
        } else if (animal.getClass().equals(Dog.class)) {
            ((Dog) animal).woof();
        } else if (animal.getClass().equals(Cow.class)) {
            ((Cow) animal).moo();
        } else {
            throw new UnknownAnimalException("Unknown animal!");
        }
    }
}
