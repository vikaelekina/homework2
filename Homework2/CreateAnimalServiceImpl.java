package Homework2;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    public ArrayList<AbstractAnimal> create(int n) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int key = ThreadLocalRandom.current().nextInt(0, AnimalType.values().length);
            AnimalType type = AnimalType.values()[key];
            animals.add(createOneAnimal(type));
            animals.get(i).printAnimal();
        }
        System.out.println("Создание окончено" + "\n");
        return animals;
    }

    public ArrayList<AbstractAnimal> create() {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        int i = 0;
        do {
            int key = ThreadLocalRandom.current().nextInt(0, CreateAnimalService.AnimalType.values().length);
            CreateAnimalService.AnimalType type = CreateAnimalService.AnimalType.values()[key];
            animals.add(createOneAnimal(type));
            animals.get(i).printAnimal();
            i++;
        } while (i < 10);
        System.out.println("Создание окончено" + "\n");
        return animals;
    }
}
