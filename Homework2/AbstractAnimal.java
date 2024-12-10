package Homework2;

import java.time.LocalDate;

public abstract class AbstractAnimal implements Animal {
    protected String breed;//порода
    protected String name;//имя
    protected double cost;//цена в магазине
    protected String character;//характер
    protected LocalDate birthDate;//день рождения животного

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public LocalDate getLocalDate() {
        return birthDate;
    }

    public AbstractAnimal(String breed, String name, double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    public void printAnimal() {
        System.out.println("Порода: " + breed + ", имя: " + name + ", цена в магазине: " + cost + ", характер: " + character + ", дата рождения животного:" + birthDate);
    }

    public boolean equals(AbstractAnimal animal) {
        if (!this.breed.equals(animal.breed)){
            return false;
        }
        if(!this.name.equals(animal.name)){
            return false;
        }
        if(this.cost!=animal.cost){
            return false;
        }
        if(!this.character.equals(animal.character)){
            return false;
        }
        return this.birthDate == animal.birthDate;
    }

}
