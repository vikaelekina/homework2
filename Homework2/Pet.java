package Homework2;

import java.time.LocalDate;

class Pet extends AbstractAnimal {
    public Pet(String breed, String name, double cost, String character, LocalDate birtDate) {
        super(breed, name, cost, character, birtDate);
    }
    void sayWithPeople(){
        System.out.println("Говорят с людьми");
    }
}
