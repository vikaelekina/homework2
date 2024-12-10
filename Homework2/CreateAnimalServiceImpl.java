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
            System.out.println("Порода: " + animals.get(i).breed + ", имя: " + animals.get(i).name + ", цена в магазине: " + animals.get(i).cost + ", характер: " + animals.get(i).character + ", дата рождения животного: " + animals.get(i).getDateString());
        }
        System.out.println("Создание окончено" + "\n");
        return animals;
    }

    @Override
    public ArrayList<AbstractAnimal> create() {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        int i = 0;
        do {
            int key = ThreadLocalRandom.current().nextInt(0, CreateAnimalService.AnimalType.values().length);
            CreateAnimalService.AnimalType type = CreateAnimalService.AnimalType.values()[key];
            animals.add(createOneAnimal(type));
            System.out.println("Порода: " + animals.get(i).breed + ", имя: " + animals.get(i).name + ", цена в магазине: " + animals.get(i).cost + ", характер: " + animals.get(i).character + ", дата рождения животного: " + animals.get(i).getDateString());
            i++;
        } while (i < 10);
        System.out.println("Создание окончено" + "\n");
        return animals;
    }
}
