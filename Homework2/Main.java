package Homework2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createAnimal = new CreateAnimalServiceImpl();
        createAnimal.createAnimals();
        createAnimal.create(4);
        ArrayList<AbstractAnimal> animals = createAnimal.create();
        SearchServiceImpl searchAnimal = new SearchServiceImpl();
        System.out.println(searchAnimal.findLeapYearNames(animals));
        System.out.println(searchAnimal.findOlderAnimal(animals,10));
        System.out.println(searchAnimal.findDuplicate(animals));

    }
}

