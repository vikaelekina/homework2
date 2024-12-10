package Homework2;

import java.time.LocalDate;

public class Cat extends Pet {
    public Cat(String breed, String name, double cost, String character, LocalDate birtDate) {
        super(breed, name, cost, character, birtDate);
    }

    @Override
    void sayWithPeople() {
        System.out.println("Говорят людям: Мяу");
    }
}
