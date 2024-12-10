package Homework2;

import java.util.ArrayList;

public interface SearchService {
    ArrayList<String> findLeapYearNames (ArrayList<AbstractAnimal> animals);
    ArrayList<String> findOlderAnimal (ArrayList<AbstractAnimal> animals, int N);
    ArrayList<String> findDuplicate (ArrayList<AbstractAnimal> animals);
}
