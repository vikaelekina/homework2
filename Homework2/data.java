package Homework2;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class data {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(1970,1,1);
        LocalDate end = LocalDate.now();
        long startDays = start.toEpochDay();
        long endDays = end.toEpochDay();
        long random = ThreadLocalRandom.current().nextLong(startDays, endDays);
        LocalDate randomDate = LocalDate.ofEpochDay(random);
        System.out.println(randomDate);
    }
}

