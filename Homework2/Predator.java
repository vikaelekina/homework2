package Homework2;

import java.time.LocalDate;

public class Predator extends AbstractAnimal {
    public Predator(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

     void hunting(){
         System.out.println("Охотится");
     };
}
