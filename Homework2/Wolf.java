package Homework2;

import java.time.LocalDate;

class Wolf extends Predator {
    public Wolf(String breed, String name, double cost,String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    void hunting() {
        System.out.println("Охотится на крупных диких копытных млекопитающих");
    }
}
