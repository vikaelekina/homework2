package Homework2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public String getDateString() {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return birthDate.format(pattern);
    }

    public AbstractAnimal(String breed, String name, double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    public void printAnimal() {
        System.out.println("Порода: " + breed + ", имя: " + name + ", цена в магазине: " + cost + ", характер: " + character + ", дата рождения животного: " + getDateString());
    }

    public abstract boolean equals(AbstractAnimal animal);
}

