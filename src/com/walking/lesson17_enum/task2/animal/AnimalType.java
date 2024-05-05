package com.walking.lesson17_enum.task2.animal;

public enum AnimalType {
    CAT("meow"), DOG("woof"), COW("moo");
    private final String sound;

    AnimalType(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
