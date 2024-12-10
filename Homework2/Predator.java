package Homework2;

import java.time.LocalDate;

public class Predator extends AbstractAnimal {
    public Predator(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
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

    void hunting(){
         System.out.println("Охотится");
     };
}
