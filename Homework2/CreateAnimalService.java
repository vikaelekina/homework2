package Homework2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public interface CreateAnimalService {
    default ArrayList<AbstractAnimal> createAnimals() {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        int i = 0;
        while (i < 10) {
            int key = ThreadLocalRandom.current().nextInt(0,AnimalType.values().length);
            AnimalType type = AnimalType.values()[key];
            animals.add(createOneAnimal(type));
            animals.get(i).printAnimal();
            i++;
        }
        System.out.println("Создание окончено" + "\n");
        return animals;
    }

    default AbstractAnimal createOneAnimal(AnimalType type) {
        return switch (type) {
            case Wolf ->
                    new Wolf("Серый волк", "Акела"+ThreadLocalRandom.current().nextInt(0, 1000), ThreadLocalRandom.current().nextDouble(0, 100000), "Агрессивный", createRandomDate());
            case Shark ->
                    new Shark("Тигровая акула", "Брюс"+ThreadLocalRandom.current().nextInt(0, 1000), ThreadLocalRandom.current().nextDouble(0, 100000), "Агрессивный", createRandomDate());
            case Cat ->
                    new Cat("Экзот", "Гарфилд"+ThreadLocalRandom.current().nextInt(0, 1000), ThreadLocalRandom.current().nextDouble(0, 100000), "Дружелюбный", createRandomDate());
            case Dog ->
                    new Cat("Немецкая овчарка", "Барон"+ThreadLocalRandom.current().nextInt(0, 1000), ThreadLocalRandom.current().nextDouble(0, 100000), "Дружелюбный", createRandomDate());
        };
    }

    default LocalDate createRandomDate() {
        LocalDate start = LocalDate.of(1970, 1, 1);
        LocalDate end = LocalDate.now();
        long startDays = start.toEpochDay();
        long endDays = end.toEpochDay();
        long random = ThreadLocalRandom.current().nextLong(startDays, endDays);
        return LocalDate.ofEpochDay(random);
    }

    enum AnimalType {
        Wolf,
        Shark,
        Dog,
        Cat
    }
}
