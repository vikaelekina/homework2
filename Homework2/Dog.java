package Homework2;

import java.time.LocalDate;

class Dog extends Pet {
    public Dog(String breed, String name, double cost, String character, LocalDate birtDate) {
        super(breed, name, cost, character, birtDate);
    }

    @Override
    void sayWithPeople() {
        System.out.println("Говорят людям: Гав");
    }
}
