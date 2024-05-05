package com.walking.lesson17_enum.task2;

import com.walking.lesson17_enum.task2.animal.AnimalType;

/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson14_polymorphism/task2">...</a>
 * через enum. Пусть Cow, Dog и Cat будут значениями enum'а Animal.
 */
public class Main {
    public static void main(String[] args) {
        for (AnimalType animal: AnimalType.values()) {
            System.out.println(animal.getSound());
        }
    }
}
