package Homework2;

import java.time.LocalDate;

class Shark extends Predator {
    public Shark(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    void hunting() {
        System.out.println("Охотятся на рыбу, падаль, мелких морских млекопитающих, планктон и ракообразных");
    }
}
