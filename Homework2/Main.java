package Homework2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CreateAnimalServiceImpl createAnimal = new CreateAnimalServiceImpl();
        ArrayList<AbstractAnimal> animals = createAnimal.createAnimals();
        createAnimal.create(4);
        createAnimal.create();
        SearchServiceImpl searchAnimal = new SearchServiceImpl();
        System.out.println("Животные, родившиеся в високосный год:"+"\n"+searchAnimal.findLeapYearNames(animals)+"\n");
        System.out.println("Животные старше заданного количества лет");
        searchAnimal.findOlderAnimal(animals,10).forEach(AbstractAnimal::printAnimal);
        searchAnimal.findDuplicate(animals);
    }
}

