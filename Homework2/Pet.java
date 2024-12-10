package Homework2;

import java.time.LocalDate;

class Pet extends AbstractAnimal {
    public Pet(String breed, String name, double cost, String character, LocalDate birtDate) {
        super(breed, name, cost, character, birtDate);
    }

    @Override
    public boolean equals(AbstractAnimal animal) {
        if (!this.breed.equals(animal.breed)) {
            return false;
        }
        if (!this.name.equals(animal.name)) {
            return false;
        }
        if (this.cost != animal.cost) {
            return false;
        }
        if (!this.character.equals(animal.character)) {
            return false;
        }
        return this.birthDate == animal.birthDate;
    }

    void sayWithPeople(){
        System.out.println("Говорят с людьми");
    }
}
